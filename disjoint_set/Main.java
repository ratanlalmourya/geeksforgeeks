
public class Main {
    
    static int parent[] ;

    public static void main(String[] args) {
        
        int n = 5;
        parent = new int[n];
        initialize();

        System.out.println();
        for(int temp : parent)
		{
		   System.out.print(temp + " ");
		}

        union(0, 2);
		union(0, 4);

        System.out.println();
        for(int temp : parent)
		{
		   System.out.print(temp + " ");
		}

    }

    private static void initialize()
    {
        for(int i = 0; i < parent.length; i++)
        {
            parent[i] = i;
        }
    }

    private static int find(int x)
    {
        if(parent[x] == x)
        {
            return x;
        }

        return find(parent[x]);
    }

    private static void union(int x,int y) {

        int x_rep = find(x);
        int y_rep = find(y);

        if(x_rep == y_rep)
        {
            return;
        }
        parent[y_rep] = x_rep;
    }


}


