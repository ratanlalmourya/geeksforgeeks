package dynamic_programming.longest_common_subsequence;

public class LcsMemo {
    
    int[][] memo_arr;

    public LcsMemo(int m,int n)
    {
        memo_arr = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                memo_arr[i][j] = -1;
            }
        }
    }

    public int lcs(String s1,String s2,int m,int n)
    {
        if(memo_arr[m][n] != -1)
        {
            return memo_arr[m][n];
        }

        if(n == 0 || m == 0)
        {
            memo_arr[m][n] = 0;

        }else {

            if(s1.charAt(m-1) == s2.charAt(n-1)) {
                memo_arr[m][n] = 1 + lcs(s1, s2, m-1, n-1);
            }else {
                memo_arr[m][n] = Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
            }
        }

        return memo_arr[m][n];
    }
}
