package dynamic_programming.longest_common_subsequence;

public class Main {
    
    public static void main(String[] args) {
        
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        int m = s1.length();
        int n = s2.length();

        System.out.println(s1 + " : " + m);
        System.out.println(s2 + " : " + n);

        // Call LCS function to evaluate longest common subsequence
        LcsRec lcsRec = new LcsRec();
        int ans = lcsRec.lcs(s1, s2, m, n);
        System.out.println("Longest common subsequence using recursion " + ans);

        // Longest common subsequence using lcs memoization
        LcsMemo lcsMemo = new LcsMemo(m+1,n+1);
        ans = lcsMemo.lcs(s1, s2, m, n);
        System.out.println("Longest common subsequence using memoization  " + ans);


    }
}
