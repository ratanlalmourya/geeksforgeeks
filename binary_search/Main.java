package binary_search;

public class Main {
    
    public static void main(String[] args) {
        
        Integer[] arr1 = {10,20,30,40,50,60};
        Integer x1 = 20;

        Integer[] arr2 = {5,15,25};
        Integer x2 = 25;

        Integer[] arr3 = {5,10,15,25,35};
        Integer x3 = 26;

        System.out.println(binary_search_iterative(arr1,x1));
        System.out.println(binary_search_iterative(arr2, x2));
        System.out.println(binary_search_iterative(arr3, x3));

        System.out.println("*****************************");
        System.out.println(binary_search_recursive(arr1,x1,0,arr1.length));
        System.out.println(binary_search_recursive(arr2, x2,0,arr2.length));
        System.out.println(binary_search_recursive(arr3, x3,0,arr3.length));

    }

    private static Integer binary_search_iterative(Integer[] arr,Integer x) {
        
        Integer left = 0;
        Integer right = arr.length;
       
        while (left <= right) {
            Integer mid = (left + right)/2;
            if(arr[mid] == x) {
                return mid;
            }else if(x < arr[mid]) {
                right = mid - 1;
            }else if(x > arr[mid]) {
                left = mid + 1;
            }
        }

        return -1;
    }

    private static Integer binary_search_recursive(Integer[] arr, Integer x,Integer left,Integer right){

        if(left > right)
        {
            return -1;
        }

        Integer mid = (left + right)/2;

        if(arr[mid] == x) {
            return mid;
        }else if(x < arr[mid]){
            return binary_search_recursive(arr,x,left,mid-1);
        }else {
            return binary_search_recursive(arr, x, mid+1, right);
        }
        
    }
}
