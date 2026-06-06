//public class InsertAtBegnning {
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//        }
//    }
//
//    static class LinkedList {
//
//        Node head = null;
//        Node tail = null;
//
//        void insertAtBeginning(int val) {
//
//            Node temp = new Node(val);
//
//            if (head == null) {
//               insertAtEnd(val);
//            } else {
//                temp.next = head;
//                head = temp;
//            }
//        }
//
//        void insertAtEnd(int val) {
//            Node temp = new Node(val);
//            if(head == null) {
//                head = temp;
//                tail = temp;
//            }else{
//                tail.next = temp;
//                tail = temp;
//
//            }
//        }
//
//        void display() {
//            Node curr = head;
//
//            while (curr != null) {
//                System.out.print(curr.data + " ");
//                curr = curr.next;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//        LinkedList ll = new LinkedList();
//
//        ll.insertAtBeginning(5);
//        ll.insertAtBeginning(3);
//        ll.insertAtBeginning(1);
//        ll.insertAtEnd(6);
//        ll.insertAtEnd(4);
//
//        ll.display();
//    }
