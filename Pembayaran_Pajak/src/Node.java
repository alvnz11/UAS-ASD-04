public class Node {
    Kendaraan data;
    Node next, prev;

    Node(Node prev, Kendaraan data, Node next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}