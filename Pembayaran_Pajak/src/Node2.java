public class Node2 {
    TransaksiPajak data;
    Node next, prev;

    Node2(Node prev, TransaksiPajak data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}