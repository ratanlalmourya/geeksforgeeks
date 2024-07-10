package mathematics.greatest_common_divisor;

public class Main {
    
    public static void main(String[] args) {

        // System.out.println(find_gcd_v1(7,13));
        System.out.println(find_gcd_v2(7, 200));

    }

    public static Integer find_gcd_v1(Integer a, Integer b) {

        while (a > 0 && a != b) {
            
            if(a > b) {
                a = a - b;
            }else {
                b = b - a;
            }
        }

        return b;
    }

    public static Integer find_gcd_v2(Integer a, Integer b) {

        if(a == 0)
        {
            return b;
        }
        
        return find_gcd_v2(b%a, a);
    }
}
