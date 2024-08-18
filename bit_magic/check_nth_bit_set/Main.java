package bit_magic.check_nth_bit_set;

public class Main {
    
    public static void main(String[] args) {
        
        Integer n = 8;
        Integer k = 2;
        // 1000
        System.out.println(checkNthBit(n, k));
        
    }

    private static boolean checkNthBit(Integer n,Integer k) {
        return (n & 1<<(k-1)) != 0;
    }
}
