package hashing.linearProbingInHashing;

import java.util.Arrays;

class Solution{
    //Function to fill the array elements into a hash table 
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {
        //Your code here
        int[] hashTable=new int[hash_size];
        Arrays.fill(hashTable,-1);
        
        if(sizeOfArray == 0)
        {
            return hashTable;
        }
        if(hash_size == 0)
        {
            return null;
        }
        
        for(int i = 0; i < sizeOfArray; i++)
        {
            int hashIndex = arr[i] % hash_size;

            if (hashTable[hashIndex] == -1) {
                hashTable[hashIndex] = arr[i];
            } else {
                int newIndex = (hashIndex + 1) % hash_size;
                while (hashTable[newIndex] != -1) {
                    newIndex = (newIndex + 1) % hash_size;
                    if(newIndex == hashIndex)
                    {
                        return null;
                    }
                }
                if (hashTable[newIndex] == -1) {
                    hashTable[newIndex] = arr[i];
                }
            }
            
        }
        
        return hashTable;
         
        
    }

}
