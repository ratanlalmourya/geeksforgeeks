package bit_magic.lookup_table;

public class Main {

    static int[] table = new int[256];

    public static void main(String[] args) {
        initialize();
        System.out.println(countSetBits(9));
    }

    private static int countSetBits(int n) {
        return table[n & 255] +
               table[(n>>8) & 255] +
               table[(n>>16) & 255] +
               table[(n>>24)];
    }

    private static void initialize() {
        for (int i = 1; i < table.length; i++) {
            table[i] = table[(i & (i-1))] + 1;
        }
    }
}
