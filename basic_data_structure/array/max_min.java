package basic_data_structure.array;

public class max_min {
    
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 2, 2, 2, 5, 4, 2 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
    }
}
