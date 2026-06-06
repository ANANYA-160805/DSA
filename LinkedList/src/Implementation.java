//public class Implementation {
//
//    static class Node {
//        int val;
//        Node next;
//
//        Node(int val) {
//            this.val = val;
//        }
//    }
//
//    static class LinkedList {
//        Node head;
//        Node tail;
//
//        void add(int data) {
//            Node temp = new Node(data);
//
//            if (head == null) {
//                head = temp;
//                tail = temp;
//            } else {
//                tail.next = temp;
//                tail = temp;
//            }
//        }
//
//        void display() {
//            Node temp = head;
//
//            while (temp != null) {
//                System.out.print(temp.val + " ");
//                temp = temp.next;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//        LinkedList ll = new LinkedList();
//
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//
//        ll.display();
//    }
//}