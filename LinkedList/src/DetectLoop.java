public class DetectLoop {
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

        DetectLoop dl = new DetectLoop();
        boolean loop = dl.detectLoop(head);

        System.out.println(loop);
    }
    public boolean detectLoop(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
