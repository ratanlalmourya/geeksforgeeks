package hashing.chaining;

public class Main {

    public static void main(String[] args) {
        
        MyHash myHash = new MyHash(7);

        myHash.Insert(77);
        myHash.Insert(48);
        myHash.Insert(49);
        myHash.Insert(52);
        myHash.Insert(51);

        System.out.println(myHash.table);

        System.out.println(myHash.Search(51));
    }
}