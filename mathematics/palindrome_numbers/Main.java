package mathematics.palindrome_numbers;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(check_palindrome_number(78987));
    }

    public static Boolean check_palindrome_number(int n) {

        int temp = n;
        int reverseOfN = 0;

        while (temp > 0) {
            reverseOfN = reverseOfN*10 + temp%10;
            temp = temp / 10; 
        }
        
        return n == reverseOfN;
    }
}
