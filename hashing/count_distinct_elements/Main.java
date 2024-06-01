package hashing.count_distinct_elements;

import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        
        Integer[] array1 = {15, 12, 13, 12, 13, 13, 18};
        Integer[] array2 = {10, 10, 10};
        Integer[] array3 = {10, 11, 12};

        System.out.println(countDistinctElements_n1(array1));
        System.out.println(countDistinctElements_n1(array2));
        System.out.println(countDistinctElements_n1(array3));

    }

    public static Integer countDistinctElements_n1(Integer[] array) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            
            hashMap.put(array[i], hashMap.getOrDefault(array[i], 0) + 1);
        }
        return hashMap.size();
    }
}
