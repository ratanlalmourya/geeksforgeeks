package hashing.sub_array_with_given_sum;

import java.util.HashSet;

public class Main {
    
    public static void main(String[] args) {
        
        Integer[] array1 = {5,8,6,13,3,-1};
        Integer sum1 = 22;

        Integer[] array2 = {15, 2, 8, 10, -5, -8, 6};
        Integer sum2 = 3;

        

        
        Integer[] array3 = {3,2,5,6};
        Integer sum3 = 10;

        
        // Naive Solution
        find_sub_array_with_given_sum_n2(array1,sum1);
        find_sub_array_with_given_sum_n2(array2,sum2);
        find_sub_array_with_given_sum_n2(array3,sum3);
        System.out.println("*******************");
        // Efficient Solution
        find_sub_array_with_given_sum_n1(array1,sum1);
        find_sub_array_with_given_sum_n1(array2,sum2);
        find_sub_array_with_given_sum_n1(array3,sum3);

        

    }

    public static void find_sub_array_with_given_sum_n2(Integer[] array,Integer sum) {

        for (int i = 0; i < array.length; i++) {
            Integer sumOfSubArray = 0;
            for (int j = i; j < array.length; j++) {
                sumOfSubArray += array[j];
                if(sumOfSubArray == sum) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }

    public static void find_sub_array_with_given_sum_n1(Integer[] array,Integer sum) {

        HashSet<Integer> hashSet = new HashSet<>();

        Integer prevSum = 0;
        for (int i = 0; i < array.length; i++) {
            prevSum += array[i];

            if(hashSet.contains(prevSum - sum))
            {
                System.out.println("YES");
                return;
            }

            if(prevSum == sum) {
                System.out.println("YES");
                return;
            }

            hashSet.add(prevSum);
        }

        System.out.println("NO");
    }
}
