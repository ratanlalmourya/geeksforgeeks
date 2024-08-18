package bit_magic.brian_kerningam;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(brian_kerningam(12));
    }

    private static Integer brian_kerningam(Integer n) {
        Integer count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}