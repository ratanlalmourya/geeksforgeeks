package hashing.linearProbingInHashing;

import java.util.Arrays;

public class MyHash {

    Integer[] arr;
    Integer cap;
    Integer size;
    public MyHash(Integer capacity)
    {   
        cap = capacity;
        size = 0;
        arr = new Integer[capacity];
        Arrays.fill(arr, -1);
        
    }

    Integer hash(Integer key)
    {
        return key % cap;
    }

    public boolean Insert(Integer value)
    {
       if(size == cap) {
        return false;
       }

       Integer h =  hash(value);
       Integer i = h;
       while (arr[i] != -1 && arr[i] != -2 && arr[i] != value) {
            i =  (i + 1) % cap;
       }

       if(arr[i] == value) {
        return false;
       }else  {
            arr[i] = value;
            size++;
            return true;
       }
    }

    public boolean Delete(Integer value)
    {
        Integer h = hash(value);
        Integer i = h;

        while (arr[i] != value && arr[i] != -1) {
            i =   (i + 1)%cap;
            if(i == h) {
                return false;
            }
        }

        if(arr[i] == value) {
            arr[i] = -2;
            size--;
            return true;
        }

        return false;
    }

    public boolean Search(Integer value)
    {
        int h = hash(value);
        int i = h;

        while (arr[i] != -1 && arr[i] != value) {
            i = (i + 1)%cap;
            if(i == h) {
                return false;
            }
        }

        return arr[i] == value;
    }
    
}
