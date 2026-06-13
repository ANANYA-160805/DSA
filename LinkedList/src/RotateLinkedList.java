public class RotateLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k =2;
        RotateLinkedList rl = new RotateLinkedList();
       Node rotate = rl.RotateLList(head, k);

       while(rotate!=null){
           System.out.print(rotate.data +" ");
           rotate = rotate.next;
       }

    }
    public static Node RotateLList(Node head, int k) {

        if(head == null)
            return null;

        if(k == 0)
            return head;

        Node fast = head;
        Node slow = head;

        for(int i=1;i<k+1;i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        Node a = slow.next;
        slow.next = null;
        Node temp=a;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return a;
    }
}
