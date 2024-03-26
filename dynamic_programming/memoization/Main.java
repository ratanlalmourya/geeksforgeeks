package dynamic_programming.memoization;

public class Main {

    private static int[] memo_arr;
    public static void main(String[] args) {
        

        int n = 5;
        memo_arr = new int[n];
        System.out.println("Memoozation ****************");
        for(int i = 0; i < n; i++)
        {
            memo_arr[i] = -1;
        }

        System.out.println("memo_arr *********************");
        for(int i = 0; i < n; i++)
        {
            System.out.println(memo_arr[i]);
        }

        System.out.println("Calling memoization function **************");

        memoizationRec(n-1);

        
        System.out.println("result *********************");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(memo_arr[i]);
        }

    }


    public static int memoizationRec(int n)
    {
        if(memo_arr[n] == -1)
        {
            if(n == 0 || n == 1)
            {
                memo_arr[n] = n;
            }else {
                memo_arr[n] = memoizationRec(n-1) + memoizationRec(n-2);
            }
        }

        return memo_arr[n];
    }
}
