package graph;

import java.util.ArrayList;

public class Main {
    
    static GraphUtils  graphUtils = new GraphUtils();
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);
        printGraph(adj);
        graphUtils.BFS(adj, v, 0);

        System.out.println("DFS traversal");
        DFSForNotConnectedGraphs(adj, v);
        detectNumberCyclesInGraph(adj,v);

        // detect cycle in directed graph
        System.out.println("*********** directed graph ***************** ");
        ArrayList<ArrayList<Integer>> directedAdj = new ArrayList<>();
        v = 6;
        for (int i = 0; i < v; i++) {
            directedAdj.add(new ArrayList<Integer>());
        }

        addEdgeForDirectedGraph(directedAdj,0,1);
        addEdgeForDirectedGraph(directedAdj,2,1);
        addEdgeForDirectedGraph(directedAdj,2,3);
        addEdgeForDirectedGraph(directedAdj,3,4);
        addEdgeForDirectedGraph(directedAdj,4,5);
        addEdgeForDirectedGraph(directedAdj,5,3);
        
        if(graphUtils.DetectCycleInAndirectedGraph(directedAdj,v))
        {
            System.out.println("Cycled detected !!");
        }else {
            System.out.println("Don't have any cycle");
        }

        // Topological Sorting
        directedAdj = new ArrayList<ArrayList<Integer>>();
        v = 5;

        for(int i = 0; i < v; i++)
        {
            directedAdj.add(new ArrayList<>());
        }

        addEdgeForDirectedGraph(directedAdj, 0, 1);
        addEdgeForDirectedGraph(directedAdj, 1, 3);
        addEdgeForDirectedGraph(directedAdj, 3, 4);
        addEdgeForDirectedGraph(directedAdj, 2, 3);
        addEdgeForDirectedGraph(directedAdj, 2, 4);
        // printGraph(directedAdj);

        graphUtils.TopologicalSorting(directedAdj,v);
        System.out.println();
        graphUtils.FindNumberOfCycleInGraph(directedAdj, v);
        graphUtils.TopologicalSortingUsingDFS(directedAdj,v);
        System.out.println();

    }

    private static void detectNumberCyclesInGraph(ArrayList<ArrayList<Integer>> adj,int v){
        Boolean[] visited = new Boolean[v];
        for(int i = 0; i < v; i++)
        {
            visited[i] = false;
        }


        for(int u = 0; u < v; u++)
        {
            if(visited[u] == false)
            {
                if(graphUtils.DetectCycleInAnUndirectedGraph(adj, u, visited, -1) == true)
                {
                    System.out.println("Cycle detected ");
                    break;
                }
            }
        }

    }

    private static void DFSForNotConnectedGraphs(ArrayList<ArrayList<Integer>> adj,int v) {
        System.out.println();
        Boolean[] visited = new Boolean[v];
        for(int i = 0; i < v; i++)
        {
            visited[i] = false;
        }

        // number of disconnected nodes
        int disconnectedNodes = 0;

        for(int i = 0; i < v; i++)
        {
            if(visited[i] == false)
            {
                disconnectedNodes++;
                graphUtils.DFS(adj, i, visited);
            }
        }
        System.out.println();
        System.out.println("Disconnected Nodes " + disconnectedNodes);
        
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    private static void addEdgeForDirectedGraph(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    } 

}
