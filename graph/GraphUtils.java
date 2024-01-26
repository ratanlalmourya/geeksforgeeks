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

    public boolean DetectCycleInAndirectedGraph(ArrayList<ArrayList<Integer>> adj,int v) {

        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];

        for(int i = 0; i < v; i++)
        {
            visited[i] = false;
            recStack[i] = false;
        }

        for(int i = 0; i < v; i++)
        {
            if(visited[i] == false)
            {
                if(DetectCycleInAndirectedGraphRec(adj,visited,recStack,i) == true)
                {
                    return true;
                }
            }
        }


        return false;
    }

    private boolean DetectCycleInAndirectedGraphRec(ArrayList<ArrayList<Integer>> adj,boolean[] visited,boolean[] recStack,int s)
    {
        visited[s] = true;
        recStack[s] = true;

        for(int u: adj.get(s))
        {
            if(visited[u] == false && DetectCycleInAndirectedGraphRec(adj,visited,recStack,u) == true)
            {
                return true;
            }
            else if(recStack[u] == true)
            {
                return true;
            }
        }
        
        recStack[s] = false;
        return false;
    }

    public void TopologicalSorting(ArrayList<ArrayList<Integer>> adj,int V)
    {
        Integer[] InDegree = new Integer[V];
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < V; i++)
        {
            InDegree[i] = 0;
        }

        for(int i = 0; i < V; i++)
        {
            for(Integer val:  adj.get(i))
            {
                InDegree[val]++;
            }
        }

        for(int i = 0; i < V; i++)
        {
            if(InDegree[i] == 0)
            {
                queue.add(i);
            }
        }

        while(queue.isEmpty() == false)
        {
            Integer currentNode = queue.poll();
            System.out.print(currentNode + "  ");
            for(Integer node: adj.get(currentNode))
            {
                InDegree[node]--;

                if(InDegree[node] == 0)
                {
                    queue.add(node);
                }
            }
        }

    }

    
}
