package mathematics.divisora_of_numbers;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> divisors = find_divisors_of_number(256);
        for (Integer divisor : divisors) {
            System.out.print(divisor + " ");
        }
        System.out.println();
        
    }

    private static ArrayList<Integer> find_divisors_of_number(int n) {  

        ArrayList<Integer> divisors = new ArrayList<>();

        int j = 1;

        for ( ; j * j < n; j++) { // corner case
            if(n % j == 0) {
                divisors.add(j);
            }
        }

        for ( ; j >= 1; j--) {
            if(n % j == 0) {
                divisors.add(n / j);
            }
        }
        return divisors;
    }
}
