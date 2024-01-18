import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

public class sample {
    
    public static void main(String[] args) {
        System.out.println("Ratan lal mourya");

        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

        hashMap.put(1, hashMap.getOrDefault(hashMap, 0));
    }
}