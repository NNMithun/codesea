package com.LinkedList;

public class LinkedListLength {
    public static int getlinkedListLength(Node headNode){
        int length=0;
        Node currentNode=headNode;
        while(currentNode!=null){
            length++;
            currentNode=currentNode.getNext();
        }
        return length;

    }
}
