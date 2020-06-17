package com.LinkedList;

public class ReverseLLInGroup {
    public Node reverseList(Node A, int B) {
        Node current = A;
        Node next = null;
        Node prev = null;

        int count = 0;

        while (count < B && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null)
            A.next = reverseList(next, B);

        return prev;
    }
}
