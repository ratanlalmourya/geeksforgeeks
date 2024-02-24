package greedy_algorithm.factional_knapsack;

public class Item implements Comparable<Item> {
    
    public Integer weight;
    public Integer value;
    
    public Item(Integer weight, Integer value) {
        this.weight = weight;
        this.value = value;
    }
    @Override
    public int compareTo(Item item) {

        return item.value/item.weight - this.value/this.weight;
    }

    
}
