package hashing.sub_array_with_zero_sum;

import java.util.HashSet;

public class Main {
    
    public static void main(String[] args) {
        
        Integer[] array = { 1, 4, 13, -3, -10, 5};

        // Naive solution
        long start = System.nanoTime();
        find_zero_sum_array_n2(array);
        long finish = System.nanoTime();
        System.out.println(finish - start);
        // Efficient Solution
        System.out.println("*************************");
        start = System.nanoTime();
        find_zero_sum_array_n1(array);
        finish = System.nanoTime();
        System.out.println(finish - start);

    }

    public static void find_zero_sum_array_n1(Integer[] array) {

        HashSet<Integer> hashSet = new HashSet<>();

        Integer prevSum = 0;
        for (int i = 0; i < array.length; i++) {

            prevSum += array[i];

            if (hashSet.contains(prevSum)) {
                System.out.println("YES");
                return;
            }

            if (prevSum == 0) {
                System.out.println("YES");
                return;
            }

            hashSet.add(prevSum);
        }

        System.out.println("NO");
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
