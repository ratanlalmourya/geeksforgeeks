package mathematics.check_prime_number;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(check_prime_number_v1(73));
    }

    public static boolean check_prime_number_v1(Integer n) { 

        if(n == 1) {
            return true;
        }

        for (int i = 2; i * i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
