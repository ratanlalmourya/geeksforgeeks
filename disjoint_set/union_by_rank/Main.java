package union_by_rank;

public class Main {
    
    public static void main(String[] args) {
        int V = 3;
        int E = 3;

        Graph  graph = new Graph(V, E);

        graph.edges[0].source = 0;
        graph.edges[0].destination = 1;

        graph.edges[1].source = 1;
        graph.edges[1].destination = 2;

        graph.edges[2].source = 0;
        graph.edges[2].destination = 2;


        for(Edge edge: graph.edges)
        {
            System.out.println(edge.source + " --- " + edge.destination);
        }

        if(detectCycle(graph) == 1)
        {
            System.out.println("Graph detected cycle");
        }else {
            System.out.println("Graph don't have cycle ");
        }
    }

    private static int detectCycle(Graph graph) {
        // Allocate memory for creating V subsets
        Subset subsets[] = new Subset[graph.V];
        // Initialize all subsets as single element sets 
        for(int v = 0; v < graph.V; v++)
        {
            subsets[v] = new Subset();
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        // Iterate through the every edge of graph , find the subset of both vertices 
        // of every edge. if both subset is same then there is cycle

        for(Edge edge: graph.edges)
        {
            Integer x = graph.find(subsets,edge.source);
            Integer y = graph.find(subsets,edge.destination);

            if(x==y)
            {
                return 1;
            }

            graph.union(subsets,edge);
        }

        return 0;
    }
}
