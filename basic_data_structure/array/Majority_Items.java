package basic_data_structure.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Majority_Items {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        System.out.println("Majority Items : " + Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());
        
    }
}