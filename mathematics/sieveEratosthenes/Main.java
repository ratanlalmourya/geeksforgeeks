package mathematics.sieveEratosthenes;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Steve Of Eratosthenes ");
        steveOfEratosthenes(23);
        steveOfEratosthenesOptimized(23);
    }

    private static void steveOfEratosthenes(int n) {

        Boolean[] arrayList = new Boolean[n+1];
        
        Arrays.fill(arrayList, true);

        for(int p = 2; p * p <= n; p++) {
            if(arrayList[p] == true) {
                for (int i = p*p; i <= n; i += p) {
                    arrayList[i] = false;
                }
            }
        }


        for (int i = 2; i <= n; i++) {
           if(arrayList[i]) {
            System.out.print(i + " , ");
           }
        }
        System.out.println();
    }

    private static void steveOfEratosthenesOptimized(int n) {

        Boolean[] array = new Boolean[n+1];
        Arrays.fill(array, true);
        for (int i = 2; i <= n; i++) {
            if(array[i]) {
                System.out.print( i + " ");
                for (int j = i*i; j <= n; j = j + i) {
                    array[j] = false;
                }
            }
        }
    }
}


// time complexity O(nlognlogn)
// Naive solution will have O(n*n(2/3))
