package com.bridgelabs.day14_linkedlist;

import java.util.LinkedList;

public class Day14LinkedList {
    public Node head;
    public void uc1_add(int data)
    {
        Node node = new Node(data); //creating an object of Node and pushing the data to that object(node)
        if(this.head == null)
        {
            this.head = node; // if the head is null, the data in node will be pushed to head
        }
        else
        {
            Node temp = head; //else the head data is pushed to temp. where as head is null. So temp is null.
            while (temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
        System.out.println("Added "+node.data+" to the list");
    }
    public void uc2_addFirst(int data) // add front to the list
    {
        Node node = new Node(data);
        if (this.head == null) //head has the value 70 hence else part will execute
            this.head = null;
        else
        {
            node.next = this.head; //next reference is fed with 70 so the 30 will sit front of 70
            this.head = node;
        }
        System.out.println("Added "+node.data+" to the front");
    }
    public void uc3_addLast(int data) // add last to the list
    {
        Node node = new Node(data);
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node; // next reference is fed with next node data
        System.out.println("Added "+node.data+" to the last");
    }
    public void uc4_insertMiddle(int data) {
        Node node = new Node(data);
        if(this.head == null)
            this.head = node;
        else {
            Node temp = this.head;
            Node middle = this.head;
            while (temp.next != null && temp.next.next != null) {
                temp = temp.next.next;
                middle = temp.next;
            }
            node.next = middle.next;
            middle.next = node;
        }
    }
    public void uc5_pop() { //delete the first element
        if (this.head == null)
        {
            System.out.println("Empty linked list"); //if head is null list is empty
        }
       else {
            this.head = this.head.next; //head is fead with head.next
            System.out.println("removed the first node from the list");
        }
    }
    public void get()
    {
        Node node = head; //pushing head data to temp. if head data is null the temp will be null and it will show as empty
        while (node.next != null) { //if the head has some data it will be pushed to temp and shows the data
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data); //pushing head data to temp. if head data is null the temp will be null and it will show as empty
    }

}
