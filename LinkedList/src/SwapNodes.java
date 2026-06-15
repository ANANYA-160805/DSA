public class SwapNodes {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int k =2;
        SwapNodes swap = new SwapNodes();
        Node s= swap.swapping(head,k);
        while(s != null){
            System.out.print(s.data + " ");
            s = s.next;
        }
    }

    private Node swapping(Node head, int k) {
        if(head==null){
            return head;
        }
        if(k==1){
            return head;
        }

        Node fast = head;
        Node slow = head;
//         ye fast ko node se ek aage chala jayega
        for(int i=1; i<=k;i++){
            fast = fast.next;
        }
// ye slow ko peeche se k index pe la denga
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        fast =head;

        // aage se k index
        for(int i=1; i<=k-1;i++){
            fast = fast.next;
        }

//        swap
        int temp = slow.data;
        slow.data=fast.data;
        fast.data=temp;

        return head;
    }

}
