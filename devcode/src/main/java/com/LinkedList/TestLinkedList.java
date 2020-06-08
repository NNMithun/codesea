package com.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.insertAtEnd(new Node(1));
        ll.insertAtEnd(new Node(2));
        ll.insertAtEnd(new Node(3));
        ll.insertAtBegin(new Node(4));
        ll.insertAtBegin(new Node(5));
        ll.insertAtBegin(new Node(6));
        ll.insertAtBegin(new Node(7));
        ll.insertAtBegin(new Node(8));

        System.out.println(ll);
    }
}
