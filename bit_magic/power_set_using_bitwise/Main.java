package bit_magic.power_set_using_bitwise;

public class Main {
    
    public static void main(String[] args) {
        String s = "abc";
        power_set_using_bitwsise_v1(s);
        power_set_using_bitwsise_v2(s);
    }

    private static void power_set_using_bitwsise_v1(String str) {
        Double k = (double) str.length();
        Integer n = (int) Math.pow(2, k);
        for (int i = 0; i < n; i++) {
            int currentItem = i;
            String sp = "";
            int index = 0;
            while(currentItem > 0) {
                if((currentItem & 1) != 0) {
                    sp = sp + str.charAt(index);
                }
                currentItem = currentItem >> 1;
                index++;
            }

            System.out.println(sp);
            
        }
    }

    private static void power_set_using_bitwsise_v2(String str) {
        Integer k = str.length();
        Integer n = 1<<k;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if((i & (1<<j)) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print("\n");
        }
    }

}
