package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphUtils {

    public void BFS(ArrayList<ArrayList<Integer>> adj, int size, int s) {
        ArrayList<Boolean> visited = new ArrayList<Boolean>(size);
        for (int i = 0; i < size; i++) {
            visited.add(false);
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited.add(s, true);

        while (queue.isEmpty() == false) {
            int u = queue.poll();
            System.out.print(u + " ");

            for (int v : adj.get(u)) {
                if (visited.get(v) == false) {
                    queue.add(v);
                    visited.add(v, true);
                }
            }

        }
    }

    public void DFS(ArrayList<ArrayList<Integer>> adj,int s,Boolean[] visited)
    {
        visited[s] = true;
        System.out.print(s + "  ");

        for(int u : adj.get(s))
        {
            if(visited[u] == false)
            {
                DFS(adj,u,visited);
            }
        }
    }

    public boolean DetectCycleInAnUndirectedGraph(ArrayList<ArrayList<Integer>> adj,int s , Boolean[] visited,int parent)
    {
        visited[s] = true;
        System.out.print(s + "  ");
        
        for(int u : adj.get(s))
        {
            if(visited[u] == false)
            {
                if(DetectCycleInAnUndirectedGraph(adj,u,visited,s) == true)
                {
                    return true;
                }
            }

            if( u != s)
            {
                return true;
            }
        }

        return false;
    }
}
