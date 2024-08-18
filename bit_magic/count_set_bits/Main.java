package bit_magic.count_set_bits;

public class Main {
    public static void main(String[] args) {
        
        Integer n = 7;
        System.out.println(countSetBit(n));
        
    }

    private static Integer countSetBit(Integer n) {

        Integer count = 0;

        while (n != 0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }

        return count;
    }
}
