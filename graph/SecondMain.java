package graph;

public class SecondMain {
    
    public static void main(String[] args) {
        
        int graph[][] = {
                            {0, 2, 0, 6, 0},
                            {2, 0, 3, 8, 5},
                            {0, 3, 0, 0, 7},
                            {6, 8, 0, 0, 9},
                            {0, 5, 7, 9, 0},
                        };

        int V = 5;

        // minimum spanning tree
        MinimumSpanningTree minimumSpanningTree = new MinimumSpanningTree();
        System.out.println(minimumSpanningTree.MinimumSpanningTreeFn(graph, V));

    }
}
