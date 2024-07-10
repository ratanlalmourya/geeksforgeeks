package mathematics.lowest_common_multiplier;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println(lowest_common_multiple_v1(2,4));
        System.out.println(lowest_common_multiple_v1(13,65));
    }

    public static Integer  lowest_common_multiple_v1(Integer a, Integer b) {
        return (a*b)/gcd(a, b);
    }

    public static Integer gcd(Integer a, Integer b) {

        if(b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }
}
