package graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class KosarajuAlgo {

    public void kosarajuAlgoFn(LinkedList<LinkedList<Integer>> adjList , int source) {

        int V = adjList.size();

        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        Stack<Integer> stack = new Stack<Integer>();

        for(int v = 0; v < V; v++)
        {
            if(!visited[v])
            {
                fillStack(adjList,visited,stack,v);
            }
        }
        System.out.println("Stack " + stack);

        // transpose graph
        LinkedList<LinkedList<Integer>> transposeAdjList = getTranspose(adjList);

        // get stringly connected nodes from graph
        Arrays.fill(visited, false);
        for(int  v = 0; v < V; v++)
        {
            if(!visited[v])
            {
                DFSUtil(transposeAdjList,visited,v);
                System.out.println();
            }
        }


    }

    private void DFSUtil(LinkedList<LinkedList<Integer>> transposeAdjList,boolean[] visited,int s)
    {
        visited[s] = true;
        System.out.print(s + " ");

        for(int u : transposeAdjList.get(s))
        {
            if(!visited[u])
            {
                DFSUtil(transposeAdjList, visited, u);
            }
        }

    }

    private void fillStack(LinkedList<LinkedList<Integer>> adjList,boolean[] visited,Stack<Integer> stack,int s)
    {
        visited[s] = true;

        for(Integer u : adjList.get(s))
        {
            if(!visited[u])
            {
                fillStack(adjList,visited,stack,u);
            }
        }
        stack.push(s); 
    }

    private LinkedList<LinkedList<Integer>>  getTranspose(LinkedList<LinkedList<Integer>> adjList)
    {
        LinkedList<LinkedList<Integer>> transposeAdjList = new LinkedList<LinkedList<Integer>>();
        int V = adjList.size();

        for(int i = 0; i < V; i++)
        {
            transposeAdjList.add(i, new LinkedList<>());
        }
        
        for(int v = 0; v < V; v++)
        {
            Iterator<Integer> iter = adjList.get(v).iterator();

            while (iter.hasNext()) {
                transposeAdjList.get(iter.next()).add(v);
            }

        }

        return transposeAdjList;
    }
}
