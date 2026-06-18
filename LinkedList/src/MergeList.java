public class MergeList {
    public static void main(String[] args) {
        Node head1= new Node(10);
        head1.next = new Node(40);
        head1.next.next = new Node(60);
        head1.next.next.next = new Node(70);

        Node head2= new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(80);
        head2.next.next.next = new Node(90);

        MergeList list = new MergeList();
        Node m = list.ml(head1,head2);

        while(m != null){
            System.out.print(m.data + " ");
            m = m.next;
        }

    }

    private Node ml(Node head1, Node head2) {

        Node i =head1;
        Node j =head2;
        Node dummy = new Node(0);
        Node k = dummy;

        while(i!=null&&j!=null){
            if(i.data<=j.data){
                k.next = i;
                i=i.next;
            }else{
                k.next = j;
                j=j.next;
            }
            k=k.next;
        }

        if(i==null){
            k.next = j;
        }else{
            k.next = i;
        }

        return dummy.next;
    }
}
