package hashing.linear_probabing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        
        Integer hashSize1 = 10;
        Integer sizeOfArray1 = 4;
        Integer[] array1 = {4, 14, 24, 44};

        Integer hashSize2 = 10;
        Integer sizeOfArray2 = 4;
        Integer[] array2 = {9, 99, 999, 9999};

        Integer[] result = linearProbingN1(hashSize2, array2, sizeOfArray2);
        for (Integer element : result) {
            System.out.print(element + " ");
        }
        System.out.println();
        result = linearProbingN1(hashSize1, array1, sizeOfArray1);
        for (Integer element : result) {
            System.out.print(element + " ");
        }

    }

    public static Integer[] linearProbingN2(Integer hashSize, Integer[] array, Integer sizeOfArray) {
        Integer[] result = new Integer[hashSize];
        Arrays.fill(result, -1);

        for (int i = 0; i < sizeOfArray; i++) {
            Integer index = array[i]%hashSize;
            Integer prevIndex = index;
            while (result[index] != array[i] && result[index] != -1) {
                index = (index + 1)%hashSize;
                if(prevIndex == index)
                {
                    break;
                }
            }

            if(result[index] == -1) {
                result[index] = array[i];
            }
        }
        return result;
    }

    public static Integer[] linearProbingN1(Integer hashSize, Integer[] array, Integer sizeOfArray) {
        Integer[] result = new Integer[hashSize];
        Arrays.fill(result, -1);

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < sizeOfArray; i++) {
            Integer index = array[i]%hashSize;
            while (hashMap.containsKey(index)) {
                index = (index + 1)%hashSize;
            }   
            hashMap.put(index, array[i]);   
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            result[entry.getKey()] = entry.getValue();
        }

        return result;
    }
}
