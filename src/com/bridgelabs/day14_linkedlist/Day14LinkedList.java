package com.bridgelabs.day14_linkedlist;

import java.util.LinkedList;

public class Day14LinkedList {
    public Node head;
    public void add(int data)
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
    public void addFirst(int data) // add front to the list
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
