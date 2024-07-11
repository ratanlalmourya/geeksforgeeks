package mathematics.prime_factors;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> result = find_prime_factors_v1(450);

        //315  105 35 7

        for (Integer primeFactor : result) {
            System.out.print(primeFactor + " ");
        }
        System.out.println();
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
