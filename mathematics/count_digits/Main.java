package mathematics.count_digits;

public class Main {

    public static void main(String[] args) {
        System.out.println(count_digits_fn(9235));
        System.out.println(count_digits_fn(38));
        System.out.println(count_digits_fn(7));
    }

    public static Integer count_digits_fn(Integer n) {
        return (int) Math.ceil(Math.log10(n));
    }
}
