package graph;

import java.util.Arrays;

public class MinimumSpanningTree {


    public int MinimumSpanningTreeFn(int[][] graph , int V)
    {
        int[] keys = new int[V];
        Arrays.fill(keys, Integer.MAX_VALUE);
        keys[0] = 0;
        boolean[] mSet = new boolean[V];
        Arrays.fill(mSet, false);
        int res = 0;

        for(int count = 0; count < V; count++)
        {
            int u = -1;
            for(int i = 0; i < V; i++)
            {
                if(!mSet[i] && (u == -1 || keys[i] < keys[u]))
                {
                    u = i;
                }
            }
            mSet[u] = true;
            res = res + keys[u];
            for(int v = 0; v < V; v++)
            {
                if(!mSet[v] && graph[u][v] != 0 &&  graph[u][v] < keys[v])
                {
                    keys[v] =  graph[u][v];
                }
            }
        }
        for(int i = 0; i < V; i++)
        {
            System.out.println(keys[i] + " ");
        }

        return res;
    }
    
}
