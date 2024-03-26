package dynamic_programming.longest_common_subsequence;

public class LcsTabulation {
    
    int[][] tab_arr;
    public LcsTabulation(int m,int n)
    {
        tab_arr = new int[m][n];
    }

    public int lcs(String s1,String s2,int m,int n)
    {
        for(int i = 0; i <= m; i++)
        {
            tab_arr[i][0] = 0;
        }

        for(int j = 0; j <= n; j++)
        {
            tab_arr[0][j] = 0;
        }

        for(int i = 1; i <=m; i++)
        {
            for(int j = 1; j<=n; j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    tab_arr[i][j] = 1 + tab_arr[i-1][j-1];
                }else {
                    tab_arr[i][j] = Math.max(tab_arr[i][j-1], tab_arr[i-1][j]);
                }

            }
        }

        return tab_arr[m][n];
    }
}
