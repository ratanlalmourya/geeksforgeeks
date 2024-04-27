package basic_data_structure.array;

public class rotate_arr {
    
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int d = 2;

        d = d%arr.length;

        int sub_arr1[] = new int[d];
        int sub_arr2[] = new int[arr.length - d];

        for (int i = 0; i < d; i++) {

            sub_arr1[i] = arr[i];
        }

        for (int i = 0; i < arr.length - d; i++) {
            sub_arr2[i] = arr[i + d];
        }

        for(int i = 0; i < d; i++)
        {
            arr[arr.length-d-i] = sub_arr1[i];
        }

        for(int i = 0; i < arr.length - d; i++)
        {
            arr[i] = sub_arr2[i];
        }

    }
}
