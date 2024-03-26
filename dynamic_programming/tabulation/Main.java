package dynamic_programming.tabulation;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Tabulation =====================> ");
        int n = 10;
        int[] tab_arr =  new int[n];

        // add predefined base cases in tabulation
        tab_arr[0] = 0;
        tab_arr[1] = 1;


        // run for loop for remaining items
        for(int i = 2; i < n; i++)
        {
            tab_arr[i] = tab_arr[i-1] + tab_arr[i-2];
        }

        System.out.println("Tabulation Result =================> ");

        for (int i = 0; i < n; i++) {
            System.out.print(tab_arr[i] + " ");
        }
        System.out.println();

    }
    
}
