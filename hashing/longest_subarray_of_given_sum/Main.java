package hashing.longest_subarray_of_given_sum;

public class Main {
    
    public static void main(String[] args) {
        
        Integer[] array1 = {5, 8, -4, -4, 9, -2, 2};
        Integer sum1 = 0;
        Integer[] array2 = {3, 1, 0, 1, 8, 2, 3, 6};
        Integer sum2 = 5;
        Integer[] array3 = {8, 3, 7};
        Integer sum3= 15;

        Integer sub_length = find_longest_subarray_of_given_sum_n2(array1,sum1);
        System.out.println(sub_length);
        sub_length = find_longest_subarray_of_given_sum_n2(array2,sum2);
        System.out.println(sub_length);
        sub_length = find_longest_subarray_of_given_sum_n2(array3,sum3);
        System.out.println(sub_length);
    }

    public static Integer find_longest_subarray_of_given_sum_n2(Integer[] array,Integer sum) {
        Integer longest_subsequence = 0;
        for (int i = 0; i < array.length; i++) {
            Integer prevSum = 0;
            for (int j = i; j < array.length; j++) {
                prevSum+=array[j];
                if(prevSum == sum) {
                    longest_subsequence = Math.max(longest_subsequence, j - i + 1);
                }
            }
        }

        return longest_subsequence;
    }
}
