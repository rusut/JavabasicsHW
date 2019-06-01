public class LinkedListDelMiddle {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    // if the node is last in the list, it can't be deleted
    public void delMiddle(Node mid){
        if (mid.next == null){
            return ;
        }

        Node node = mid;
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public void show(Node head){
        Node n = head;
        while (n!=null){
            System.out.println("->"+n.data);
            n=n.next;
        }
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        n.next = new Node(2);
        n.next.next = new Node(3);
        n.next.next.next = new Node(4);
        Node mid = new Node(5);
        n.next.next.next.next = mid;
        n.next.next.next.next.next = new Node(6);
        System.out.println("Original list: ");
        LinkedListDelMiddle del =new LinkedListDelMiddle();
        del.show(n);
        System.out.println("List after deleting: ");
        del.delMiddle(mid);
        del.show(n);

    }
}

