package linked_list.sorted_inserted_in_linklist;

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

        head = insert_node_in_sorted_linked_list(head,5);
        linked_list_recursive(head);

    }

    public static Node insert_node_in_sorted_linked_list(Node head,int val) { 

        Node newNode = new Node(val);
        Node temp = head;
        if(temp == null) {
            return newNode;
        }

        if(temp.data > val) {
            newNode.next = temp;
            return newNode;
        }

        while (temp.next != null && temp.next.data < val) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void linked_list_recursive(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.data + " ") ;
        linked_list_recursive(head.next);
    }


}
