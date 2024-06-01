package hashing.longest_subarray_with_0s_1s;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        
        Integer[] array1 = {1, 0, 1, 1, 1, 0, 0};
        Integer[] array2 = {1, 1, 1, 1};
        Integer[] array3 = {0, 0, 1, 1, 1, 1, 1, 0};
        Integer[] array4 = {0, 0, 1, 0, 1, 1};

        // Naive solution
        System.out.println(find_longest_subarray_of_1s0s_n2(array1));
        System.out.println(find_longest_subarray_of_1s0s_n2(array2));
        System.out.println(find_longest_subarray_of_1s0s_n2(array3));
        System.out.println(find_longest_subarray_of_1s0s_n2(array4));

        System.out.println("*******************");

        // efficient solution
        System.out.println(find_longest_subarray_of_1s0s_n1(array1));
        System.out.println(find_longest_subarray_of_1s0s_n1(array2));
        System.out.println(find_longest_subarray_of_1s0s_n1(array3));
        System.out.println(find_longest_subarray_of_1s0s_n1(array4));


    }


    public static Integer find_longest_subarray_of_1s0s_n2(Integer[] array) {

        Integer result = 0;
        for (int i = 0; i < array.length; i++) {
            Integer count1s = 0;
            Integer count0s = 0;
            for (int j = i; j < array.length; j++) {
                
                if(array[j] == 1) {
                    count1s++;
                }
                if(array[j] == 0) {
                    count0s++;
                }

                if(count0s == count1s) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }
        return result;
    }

    public static Integer find_longest_subarray_of_1s0s_n1(Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0)
            {
                array[i] = -1;
            }
        }

        Integer result = 0;
        Integer prevSum = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        for (int i = 0; i < array.length; i++) {
            
            prevSum += array[i];

            if(!hashMap.containsKey(prevSum))
            {
                hashMap.put(prevSum, i);
            }

            if(hashMap.containsKey(prevSum))
            {
                result = Math.max(result,i - hashMap.get(prevSum));
            }

            if(prevSum == 0)
            {
                result = Math.max(result, i+1);
            }
        }



        return result;
    }
    
}
