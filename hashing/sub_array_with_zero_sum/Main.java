package hashing.sub_array_with_zero_sum;

public class Main {
    
    public static void main(String[] args) {
        
        Integer[] array = { 1, 4, 13, -3, -10, 5};
        find_zero_sum_array_n2(array);

    }

    public static void find_zero_sum_array_n2(Integer[] array) {
        Boolean isSubArrayExistWithZeroSum = false;
        outerloop: for (int i = 0; i < array.length; i++) {
            
            Integer sub_array_sum = 0;
            for (int j = i; j < array.length; j++) {
                sub_array_sum += array[j];
                if(sub_array_sum == 0)
                {
                    isSubArrayExistWithZeroSum = true;
                    break outerloop;
                }
            }
        }

        if(isSubArrayExistWithZeroSum) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
