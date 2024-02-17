package graph.bellman_ford_algo_for_shortest_path;

import java.util.Arrays;

public class Graph {
    
    public Integer V;
    public Integer E;
    public Edge edges[];

    public Graph(Integer V,Integer E)
    {
        this.V = V;
        this.E = E;
        this.edges = new Edge[E];
        for(int i = 0; i < E; i++)
        {
            this.edges[i] = new Edge();
        }
    }

    public void BellManFord(Graph graph, int source) {
        
        Integer distances[] = new Integer[graph.V];
        Arrays.fill(distances,Integer.MAX_VALUE);

        distances[source] = 0;

        for(Integer i = 1; i < V; i++)
        {
            for(Integer j = 0; j < E; j++)
            {
                int u = graph.edges[j].src;
                int v = graph.edges[j].dest;
                int weight = graph.edges[j].weight;

                if(distances[u] != Integer.MAX_VALUE && distances[v] > (distances[u] + weight))
                {
                    distances[v] = distances[u] + weight;
                }
            }
        }

        for(Integer j = 0; j < E; j++)
        {
            int u = graph.edges[j].src;
            int v = graph.edges[j].dest;
            int weight = graph.edges[j].weight;

            if(distances[v] != Integer.MAX_VALUE && distances[v] > (distances[u] + weight))
            {
                System.out.println("Graph contain negtive weight cycle");
            }
        }

        for(Integer temp: distances)
        {
            System.out.print(temp + " ");
        }

    }
}
