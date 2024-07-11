package mathematics.prime_factors;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> result = find_prime_factors_v1(1001);

        //315  105 35 7

        for (Integer primeFactor : result) {
            System.out.print(primeFactor + " ");
        }
        System.out.println();
        System.out.println("**************  Efficient Solution *******************");
        // 5 7    11 13    17 19     23 25   29 32    35 37   41 43
        result = find_prime_factors_effcient_solution(1001);
        for (Integer primeFactor : result) {
            System.out.print(primeFactor + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> find_prime_factors_effcient_solution(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();

        while (n > 0 && n % 2 == 0) {
            primeFactors.add(2);
            n = n / 2;
        }

        while (n > 0 && n % 3 == 0) {
            primeFactors.add(3);
            n = n / 3;
        }

        for (int i = 5; i * i <= n ; i = i + 6) {
            
            while(n % i == 0) {
                primeFactors.add(i);
                n = n / i;
            }

            while(n % (i + 2) == 0) {
                primeFactors.add(i + 2);
                n = n / (i + 2);
            }

        }

        // corner case

        if(n > 1) {
            primeFactors.add(n);
        }

        return primeFactors;
    }

    public static ArrayList<Integer> find_prime_factors_v1(Integer n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        if( n <= 1) {
            return primeFactors;
        }
        for (int i = 2; i * i <= n; i = i + 1) {     
            while(n > 0 && n % i == 0) {
                primeFactors.add(i);
                n = n / i;
            } 
        }

        if(n > 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}
