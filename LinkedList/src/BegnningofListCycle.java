public class BegnningofListCycle {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next=c;

        Node head = a;

        BegnningofListCycle obj = new BegnningofListCycle();
        Node ll = obj.loopCycle(head);
        System.out.println(ll.data);
    }

    public Node loopCycle(Node head) {
        if(head==null)
            return null;
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                Node b = head;
                while(b!=slow){
                    b=b.next;
                    slow=slow.next;
                }
                return b;
            }
        }
        return null;
    }
}
