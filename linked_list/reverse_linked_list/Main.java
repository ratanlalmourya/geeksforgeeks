package linked_list.reverse_linked_list;

public class Main {
    
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
 
        // link nodes
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        linked_list_recursive(head);
        System.out.println();
        head = reverse_linked_list(head);
        linked_list_recursive(head);
        System.out.println();
        
        
    }

    public static Node reverse_linked_list(Node head) {

        Node step1 = null;
        Node step2 = head;
        while (step2 != null) {
            Node temp = step2;
            step2 = step2.next;
            temp.next = step1; 
            step1 = temp;
        }

        return step1;
    }

    public static void linked_list_recursive(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data + " ") ;
        linked_list_recursive(head.next);
    }
}
