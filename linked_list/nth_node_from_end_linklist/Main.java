package linked_list.nth_node_from_end_linklist;

public class Main {
    
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);
 
        // link nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Integer n = 2;

        

        System.out.println(nth_node_from_end_of_linklist(head,n));
    }

    public static int nth_node_from_end_of_linklist(Node head, Integer n) {

        Node fastNode = head;
        Node slowNode = head;

        for (int i = 1; i <= n; i++) {
            fastNode = fastNode.next;
        }

        
        while(fastNode != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        if(slowNode != null) {
            return slowNode.data;
        }

        return -1;
    }
}
