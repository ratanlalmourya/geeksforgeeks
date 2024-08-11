package bit_magic.and_or_xor;

public class Main {
    
    public static void main(String[] args) {
        
        int a = 9;
        int b = 8;
        //1000
        //0011
        //1011
        //1011
        System.out.println("Bitwise and " + (a & b));
        System.out.println("Bitwise and " + (a | b));
        System.out.println("Bitwise and " + (a ^ b));
    }
}
