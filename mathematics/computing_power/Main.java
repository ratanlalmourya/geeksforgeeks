package mathematics.computing_power;

public class Main {
    
    public static void main(String[] args) {
        
        Integer n = 5;
        Integer x = 5;

        System.out.println(computing_power_recursive(x,n));
        System.out.println(computing_power_iterative(x,n));

    }


    private static Integer computing_power_recursive(Integer x,Integer n) {

        if(n == 0) {
            return 1;
        }

        Integer temp = computing_power_recursive(x,n/2);
        temp = temp * temp;
        if(n%2 == 0) {
            return temp;
        }else {
            return temp*x;
        }

    }

    private static Integer computing_power_iterative(Integer x,Integer n) {

        Integer result = 1;

        while (n > 0) {
            
            if(n%2 != 0) {
                result = result * x;
            }
            x = x * x;
            n = n / 2;
        }


        return result;
    }


}
