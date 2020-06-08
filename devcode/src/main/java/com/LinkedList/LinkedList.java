package com.LinkedList;

public class LinkedList {
    private int length=0;
    Node head;

    public LinkedList() {
        this.length = 0;
    }

    public synchronized Node getHead(){
        return head;
    }

    public synchronized  void insertAtBegin(Node node){
        node.setNext(head);
        head= node;
        length++;
    }
    public synchronized  void insertAtEnd(Node node){
        if(head==null){
            head=node;
            length++;
        }else{
            Node q= head;
           while (q.getNext()!=null){
               q=q.getNext();
           }
           q.setNext(node);
            length++;
        }
    }
    public synchronized  void insert(int data, int position){
        if(position<0){
            position=0;
        }
        else if(position>length){
            position=length;
        }
        if (head == null) {
            head= new Node(data);
        }
        else if(position==0){
            Node newNode= new Node (data);
            newNode.setNext(head);
            head= newNode;
            }
        else {
            Node temp= head;
            int i=1;
            while (i<position){
                temp=temp.getNext();
                i++;
            }
            Node newNode= new Node(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        }
    }

    }
