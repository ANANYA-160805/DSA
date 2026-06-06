 class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class InsertAtIndex {


    static class LinkedList {
        int size=0;
        Node head = null;
        Node tail = null;

        void insertAtBeginning(int val) {

            Node temp = new Node(val);

            if (head == null) {
                insertAtEnd(val);
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if(head == null) {
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;

            }
            size++;
        }

        void insertAt(int idx , int val){
            Node t = new Node(val);
            Node temp = head;

            if(idx == size()){
                insertAtEnd(val);
                return;
            }

            if(idx == 0){
                insertAtBeginning(val);
                return;
            }else if (idx<0 || idx>size()){
                System.out.println("wrong index");
                return;
            }

            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;

            size++;

        }
        int size() {
            Node temp = head;
            int count =0;

            while(temp!=null){
                 count++;
                temp = temp.next;
            }
            return count;
        }

        void deleteAt(int idx){
//            deleting head node
            if(idx==0){
                head = head.next;
                size--;
                return;
            }
            Node temp = head;

            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            // deleting last node
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;


            size--;
        }

        void display() {
            Node curr = head;

            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAtBeginning(5);
        ll.insertAtBeginning(3);
        ll.insertAtBeginning(1);
        ll.insertAtEnd(6);
        ll.insertAtEnd(4);


        ll.insertAt(2,10);
        ll.insertAt(6,50);
        ll.insertAt(0,12); /* 12-1-3-5-6-4-50*/
//        Wrong Index
        ll.insertAt(100,200);
        ll.deleteAt(4);
//        deleting last node
        ll.deleteAt(6);
//        deleting head node
        ll.deleteAt(0);




        ll.display();

        System.out.println();
        System.out.println( "size of linked list "+ ll.size);

        System.out.println( "head"+ll.head.data);
        System.out.println("tail"+ll.tail.data);

    }
}
