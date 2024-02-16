package union_by_rank;

public class Graph {
    
    public Integer V;
    public Integer E;
    public Edge[] edges;
    public Graph(Integer v, Integer e) {
        V = v;
        E = e;
        edges = new Edge[E];
        for(int i = 0; i < E; i++)
        {
            edges[i] = new Edge();
        }
    }
    public void union(Subset[] subsets, Edge edge) {

        Integer xRoot = find(subsets,edge.source);
        Integer yRoot = find(subsets, edge.destination);
        if(subsets[xRoot].rank < subsets[yRoot].rank)
        {
            subsets[xRoot].parent = yRoot;
        }else if (subsets[yRoot].rank < subsets[xRoot].rank)
        {
            subsets[yRoot].parent = xRoot;
        }else {
            subsets[xRoot].parent = yRoot;
            subsets[xRoot].rank++;
        }
    }
    public Integer find(Subset[] subsets, Integer source) {

        if(subsets[source].parent != source)
        {
            subsets[source].parent = find(subsets, subsets[source].parent);
        }

        return subsets[source].parent;
    }
    
}
