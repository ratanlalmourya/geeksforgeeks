package hashing.Chaining;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {

    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    public MyHash(int bucketSize)
    {
        BUCKET = bucketSize;
        table = new ArrayList<LinkedList<Integer>>(BUCKET);
        for(int i = 0; i < BUCKET; i++)
        {
            table.add(new LinkedList<Integer>());
        }
    }

    

}
