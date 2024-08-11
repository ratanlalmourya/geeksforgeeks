package bit_magic.signed_and_unsigned_right_shift;

public class Main {
    
    public static void main(String[] args) {
        
        int n = -4;
        System.out.println("Signed right side bitwise operator " + n +  "  : " + (n >> 9)); // -1
        System.out.println("Signed right side bitwise operator " + n +  "  : " + (n >> 1)); // -2

        System.out.println("Unsigned right side bitwise operator " + n +  "  : " + (n >>> 2)); // -1
        System.out.println("Unsigned right side bitwise operator " + n +  "  : " + (n >>> 1)); // -2

    }
}
