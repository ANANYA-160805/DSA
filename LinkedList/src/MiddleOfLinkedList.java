public class MiddleOfLinkedList {
    public static void main(String[] args) {
           Node head = new Node(1);
           head.next = new Node(2);
           head.next.next = new Node(3);
           head.next.next.next = new Node(4);

        // Instantiating the class to call the non-static method
        MiddleOfLinkedList solver = new MiddleOfLinkedList();
        Node middle = solver.listnode(head);

        // Printing the result
        if (middle != null) {
            System.out.println("The middle node value is: " + middle.data);
        }
    }
    public Node listnode(Node head){
//        int length = 0;
//        Node temp = head;
//
//        while(temp!=null){
//            temp = temp.next;
//            length++;
//        }
//        temp = head;
//        for(int i=1; i<=length/2; i++){
//            temp = temp.next;
//        }
//        return temp;

        //slow-fast approach

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
