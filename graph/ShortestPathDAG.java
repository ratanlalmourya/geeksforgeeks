package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ShortestPathDAG {
    
    public void shortestPathInWeightedGraph(LinkedList<LinkedList<AdjNode>> directedAdjWithNode,int V)
    {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++)
        {
            visited[i] = false;
        }


        for(int i = 0; i < V; i++)
        {
            if(visited[i] == false)
            {
                topologicalSortingUtil(directedAdjWithNode, i, visited, stack);
            }
        }

        int source = 0; 
        
        Integer[] dist = new Integer[V];
        for(int v = 0; v < V; v++)
        {
            dist[v] = Integer.MAX_VALUE;
        }

        dist[source] = 0;

        while(stack.isEmpty() == false)
        {
            int index = stack.pop();
            if(dist[index] != Integer.MAX_VALUE)
            {
                Iterator<AdjNode> innerIter = directedAdjWithNode.get(index).iterator();
                while(innerIter.hasNext())
                {
                    AdjNode node = innerIter.next();
                    if(dist[node.getV()] > (dist[index] + node.getWeight()))
                    {
                        dist[node.getV()] = dist[index] + node.getWeight();
                    }
                }
            }
        }

        System.out.println("Sortest path");
        for(int v: dist)
        {
            System.out.print(v + " ");
        }
        System.out.println();

    }

    private void topologicalSortingUtil(LinkedList<LinkedList<AdjNode>> directedAdjWithNode,int v,boolean visited[], Stack<Integer> stack)
    {

        visited[v] = true;

        Iterator<AdjNode> it = directedAdjWithNode.get(v).iterator();
        while (it.hasNext())
        {
            AdjNode node =it.next();
            if (!visited[node.getV()])
            topologicalSortingUtil(directedAdjWithNode,node.getV(), visited, stack);
        }
        stack.add(v);
        
    }
}
