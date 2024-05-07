package hashing.linearProbingInHashing;

public class Main {

    public static void main(String[] args) {

        int hash_size = 10;
        int arr[] =  {9,99,999,9999};
        int sizeOfArray = arr.length;

        Solution obj = new Solution();

        int[] hashTable = obj.linearProbing(hash_size, arr, sizeOfArray);



        for(int i = 0; i <hashTable.length; i++)
        {
            System.out.print(hashTable[i]+ " ");
        }
    }
}
