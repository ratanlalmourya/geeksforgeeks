package dynamic_programming.longest_common_subsequence;

public class Main {
    
    public static void main(String[] args) {
        
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        int m = s1.length();
        int n = s2.length();

        System.out.println(s1 + " : " + m);
        System.out.println(s2 + " : " + n);

        // Call LCS function to evaluate longest common subsequence O(2^n)
        LcsRec lcsRec = new LcsRec();
        int ans = lcsRec.lcs(s1, s2, m, n);
        System.out.println("Longest common subsequence using recursion " + ans);

        // Longest common subsequence using lcs memoization O(m*n)
        LcsMemo lcsMemo = new LcsMemo(m+1,n+1);
        ans = lcsMemo.lcs(s1, s2, m, n);
        System.out.println("Longest common subsequence using memoization  " + ans);


        // Longest common subsequence using lcs tabulation O(m*n)
        LcsTabulation lcsTabulation = new LcsTabulation(m+1,n+1);
        ans = lcsTabulation.lcs(s1, s2, m, n);
        System.out.println("Longest common subsequence using tabulation  " + ans);


    }
}
