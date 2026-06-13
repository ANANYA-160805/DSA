public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(4);

        RemoveDuplicateFromSortedList rd = new RemoveDuplicateFromSortedList();
        Node duplicate = rd.remove(head);

        while (duplicate != null) {
            System.out.print(duplicate.data + " ");
            duplicate = duplicate.next;
        }
    }

    private Node remove(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node i =head;
        Node j = head;

        while(j!=null){
            if(i.data==j.data){
                j=j.next;
            }else {
                i.next = j;
                i=j;
                j=j.next;
            }
            i.next=j;
        }
        return head;
    }

}
