package main.java.HW3;

import java.util.Iterator;
public class MyLinkedList implements Iterable<Node>{

    Node head;
    public MyLinkedList() {

    }

    public MyLinkedList add(User user) {
        Node newNode = new Node(user);
        newNode.next = null;
        if (this.head == null) this.head = newNode;
        else {
            Node last = this.head;
            while ((last.next != null)) {
                last = last.next;
            }
            last.next = newNode;
        }
        return this;
    }

    @Override
    public Iterator<Node> iterator() {
        return new Iterator<Node>() {
            @Override
            public boolean hasNext() {
                return head != null;
            }

            @Override
            public Node next() {
                Node currNode = head;
                head = head.getNext();
                return currNode;
            }
        };
    }
}