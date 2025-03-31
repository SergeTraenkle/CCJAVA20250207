package thema12.oop6.datenstrukturen.listen.einfachverketettelisten;

public class DoublyLinkedList {

    private DoublyNode head;

    public void add(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            DoublyNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
