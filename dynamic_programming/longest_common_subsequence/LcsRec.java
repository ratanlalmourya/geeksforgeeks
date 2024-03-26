package dynamic_programming.longest_common_subsequence;

public class LcsRec {
    
    public int lcs(String s1, String s2, int m, int n)
    {
        if(n == 0 || m == 0){
            return 0;
        }
        
        if(s1.charAt(m-1) == s2.charAt(n-1)){
           return 1 + lcs(s1, s2, m-1, n-1);
        }else{
            return Math.max(lcs(s1, s2, m-1, n), lcs(s1, s2, m, n-1));
        }
    }
}
