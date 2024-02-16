package detect_cycle;

public class Graph {

    public Integer V;
    public Integer E;
    public Edge edges[];

    public Graph(Integer V,Integer E)
    {
        this.V = V;
        this.E = E;
        this.edges = new Edge[E];
        for(int i = 0; i < E; i++)
        {
            this.edges[i] = new Edge();
        }
    }

    public Integer find(Integer[] parent, Integer i) {
        
        if(parent[i] == -1)
        {
            return i;
        }

        return find(parent, parent[i]);
    }

    public void union(Integer[] parent, Edge edge) {
        
        Integer x = find(parent, edge.source);
        Integer y = find(parent, edge.destination);
        parent[y] = x;
    }
}