package mathematics.factorial_numbers;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(find_factorial(5));

    }

    private static int find_factorial(int n) {

        if(n == 0) {
            return 1;
        }

        return n*find_factorial(n-1);
    }
}
