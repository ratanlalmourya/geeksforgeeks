package graph;

import java.util.LinkedList;

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
        System.out.println(minimumSpanningTree.MinimumSpanningTreeFn(graph, V));


        // dijkstras algorithm
        DijkastraAlgo dijkastraAlgo = new DijkastraAlgo();
        int[] distances = dijkastraAlgo.dijkastraAlgoFn(graph, 1);
        for(int distance : distances)
        {
            System.out.print(distance + " ");
        }
        System.out.println();


        // KosarajuAlgorithm 
        LinkedList<LinkedList<Integer>> adjList = new LinkedList<LinkedList<Integer>>();
        V = 5;
        for(int i = 0; i < V; i++)
        {
            adjList.add(i, new LinkedList<>());
        }

        adjList.get(0).add(2);
        adjList.get(1).add(0);
        adjList.get(2).add(1);
        adjList.get(2).add(3);
        adjList.get(3).add(4);
        adjList.get(4).add(3);



        KosarajuAlgo kosarajuAlgo = new KosarajuAlgo();
        kosarajuAlgo.kosarajuAlgoFn(adjList,0);

    }
}
