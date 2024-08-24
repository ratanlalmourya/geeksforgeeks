public class Main {
    
    public static void main(String[] args) {
        
        Integer[] arr = {4,3,4,4,4,5,5};
        System.out.println(find_odd_ones_using_xor(arr));
        Integer[] arr1 = {8,7,7,8,8};
        System.out.println(find_odd_ones_using_xor(arr1));
    }

    private static Integer find_odd_ones_using_xor(Integer[] arr) {
        Integer result = 0;
        for (Integer item : arr) {
            result = result ^ item;
        }
        return result;
    }
}
