package kruskals_mini_spanning_tree_algo;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        Integer V = 4;
        Integer E = 5;

        Edge[] edges = new Edge[E];
        edges[0] = new Edge(0, 1,10);
        edges[1] = new Edge(0,2,6);
        edges[2] = new Edge(0, 3,5);
        edges[3] = new Edge( 1, 3,15);
        edges[4] = new Edge(2,3,4);


        Arrays.sort(edges);

        for(Edge edge: edges)
        {
            System.out.println(edge.source + " " + edge.destination +  " " + edge.weight);
        }

        int minimalCost =  kruskalMST(edges,V,E);
        
        System.out.println(minimalCost);

    }

    private static int kruskalMST(Edge[] edges, Integer V, Integer E) {

        Integer minimumCost = 0;
        Integer parent[] = new Integer[V];
        for(int i = 0; i < V; i++)
        {
            parent[i] = i;
        }

        Integer u;
        Integer v;
        Integer cost;
        for(int i = 0; i < V; i++)
        {
            u = edges[i].source;
            v = edges[i].destination;
            cost = edges[i].weight;

            if(find(parent,u) != find(parent,v))
            {
                union(parent,u,v);
                minimumCost = minimumCost + cost;
            }
        }

        return minimumCost;
    }

    private static void union(Integer[] parent, Integer u, Integer v) {
        
        Integer uRoot = find(parent, u);
        Integer vRoot = find(parent, v);
        parent[uRoot] = vRoot;
    }

    private static Integer find(Integer[] parent, Integer i) {
        if(parent[i] == i)
        {
           return parent[i];
        }

        return find(parent, parent[i]);
    }

}
