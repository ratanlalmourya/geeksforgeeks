package hashing.chaining;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {

    int BUCKET;
    public ArrayList<LinkedList<Integer>> table;

    public MyHash(int bucketSize)
    {
        BUCKET = bucketSize;
        table = new ArrayList<LinkedList<Integer>>(BUCKET);
        for(int i = 0; i < BUCKET; i++)
        {
            table.add(new LinkedList<Integer>());
        }
    }

    public void Insert(int value)
    {
        int index = value % BUCKET;
        table.get(index).add(value);
    }

    public void Delete(Integer value)
    {
        int index = value % BUCKET;
        if(index < BUCKET)
        {
            table.get(index).remove(value);
        }
    }

    public boolean Search(Integer value)
    {
        int index = value % BUCKET;
        if(index <  BUCKET)
        {
            return table.get(index).contains(value);
        }
        return false;
    }

}
