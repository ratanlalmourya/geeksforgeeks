package linked_list.linked_list_impl;

public class Main {
    
    public static void main(String[] args) {
        
       Node head = new Node(10);
       Node node2 = new Node(20);
       Node node3 = new Node(30);
       Node node4 = new Node(40);
       Node node5 = new Node(50);
       Node node6 = new Node(60);

       // link nodes
       head.next = node2;
       node2.next = node3;
       node3.next = node4;
       node4.next = node5;
       node5.next = node6;

       Node temp = head;

       while(temp.next != null) {
            System.out.print(temp.data + " , ");
            temp = temp.next;
       }

    }
}
