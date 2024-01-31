package graph;
import java.util.Arrays;

public class DijkastraAlgo {
    
    public int[] dijkastraAlgoFn(int[][] graph,int source)
    {
        int V = graph.length;
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        boolean[] fin = new boolean[V]; // for finalizing nodes
        Arrays.fill(fin, false);

        for(int count = 0; count < V - 1; count++)
        {
            int u = -1;

            // fine the minimum from dist array from finalized node
            for(int i = 0; i < V; i++)
            {
                if(!fin[i] && (u == -1 || dist[i] < dist[u]))
                {
                    u = i;
                }
            }

            // finalize node
            fin[u] = true;

            // update dist for selected finalized node

            for(int v = 0; v < V; v++)
            {
                if(!fin[v] && graph[u][v] != 0)
                {
                    dist[v] = Math.min(dist[v], dist[u] + graph[u][v]);
                }
            }

        }

        return dist;
    }
}
