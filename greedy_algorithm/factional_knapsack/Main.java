package greedy_algorithm.factional_knapsack;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Item> arrayList = new ArrayList<>();
        Integer capacity = 70;
        Integer totalValues = 0;
        arrayList.add(new Item(20, 500));  //25
        arrayList.add(new Item(50, 600));  //
        arrayList.add(new Item(30, 400));
        Collections.sort(arrayList);
        for (Item item : arrayList) {
            if(item.weight <= capacity)
            {
                totalValues = totalValues + item.value;
                capacity =  capacity - item.weight;
            }else {
                totalValues = totalValues + (item.value*capacity)/item.weight;
                break;
            }
        }
        System.out.println("Maximum pickup values " + totalValues);
    }
    
}
