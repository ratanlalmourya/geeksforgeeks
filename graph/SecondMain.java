package graph;

public class SecondMain {
    
    public static void main(String[] args) {
        
        int graph[][] = {
                           {0, 5, 3},
                           {5, 0, 1},
                           {3, 1, 0}
                        };

        int V = 3;

        // minimum spanning tree
        MinimumSpanningTree minimumSpanningTree = new MinimumSpanningTree();
        // System.out.println(minimumSpanningTree.MinimumSpanningTreeFn(graph, V));


        // dijkstras algorithm
        DijkastraAlgo dijkastraAlgo = new DijkastraAlgo();
        int[] distances = dijkastraAlgo.dijkastraAlgoFn(graph, 1);
        for(int distance : distances)
        {
            System.out.print(distance + " ");
        }
        System.out.println();

    }
}
