package bit_magic.negation_leftshift;

public class Main {
    
    public static void main(String[] args) {
        
        int n = -6;
        
        System.out.println("Negation of " + n + " : " + ~n);
        // 2's complement of  -x =  2^32 - x

        // left shif of numbers using shift operator
        System.out.println("Left shift of number " + (n << 1));
        System.out.println("Left shift of number " + (n << 3));   // -6*(2^3)
        
    }
}
