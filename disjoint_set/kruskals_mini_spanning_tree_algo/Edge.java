package kruskals_mini_spanning_tree_algo;

public class Edge implements Comparable<Edge>{
    
    public Integer source;
    public Integer destination;
    public Integer weight;

    @Override
    public int compareTo(Edge o) {
        
        if(this.weight > o.weight)
        {
            return 1;
        }

        return -1;
    }

    public Edge(Integer source, Integer destination, Integer weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
    
    
}
