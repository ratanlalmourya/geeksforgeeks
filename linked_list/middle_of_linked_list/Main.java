package linked_list.middle_of_linked_list;

public class Main {
    
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node node2 = new Node(5);
        Node node3 = new Node(20);
        Node node4 = new Node(15);
        Node node5 = new Node(25);
        Node node6 = new Node(30);
 
        // link nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        middle_of_linked_list(head);
    }

    public static void middle_of_linked_list(Node head) {
        Node slowNode = head;
        Node fastNode = head;
        while (fastNode != null && fastNode.next != null && slowNode != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        if(slowNode != null){
            System.out.println(slowNode.data);
        }
    }
}
