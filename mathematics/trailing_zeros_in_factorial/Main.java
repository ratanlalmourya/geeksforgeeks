package mathematics.trailing_zeros_in_factorial;

public class Main {
    
    public static void main(String[] args) {
        
       Integer n = 100;

       // O(n)
       System.out.println(trailing_zeros_in_factorial_v1(n));
       // Log5(n)
       System.out.println(trailing_zeros_in_factorial_v2(n));

       
    }

    public static Integer trailing_zeros_in_factorial_v1(Integer n){

        if(n == 0) {
            return 0;
        }

        return (n%5 == 0 ? 1 : 0) + trailing_zeros_in_factorial_v1(n-1);
    }

    public static Integer trailing_zeros_in_factorial_v2(Integer n) {

        Integer trailing_zeros = 0;

        for (int i = 5; i < n; i=i*5) {
            trailing_zeros =  trailing_zeros + n/i;
        }

        return trailing_zeros;
    }
}
