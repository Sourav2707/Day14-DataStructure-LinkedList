package com.bridgelabs.day14_linkedlist;

import java.util.ArrayList;
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
    public int count = 0; //to find the index
    int found = 0;
    public String uc7_search(int data) {
        Node node = new Node(data);
        node = this.head; //node is fed with head
        String searchIndex = "";
        if(node != null) //if node is not null
        {
            while (node != null) //while node is not null this loop will continue and breaks when node is null
            {
                if (node.data == data) //if the given data is equal to the node data the count will get incremented to find the index
                {
                    found++;
                    break;
                }
                node = node.next;
                count++;
            }
            if (found == 1) //found is used to whether the give data is in the list or not
            {
                searchIndex = node.data+" is found at index "+count;
            }
            else
            {
                searchIndex = "The list is empty";
            }
            System.out.println(searchIndex);
        }
        return searchIndex;
    }
    public Node uc8_searchAndInsert(int position, int data) {
        int n = 0;
        Node node = new Node(data);
        Node temp = head; //feeding head to the temp node
        Node newNode = node;
            while (n != position - 1) //0 != 2-1
            {
                temp = temp.next;
                n++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Inserted "+newNode.data+" at position "+position);
        return head;
    }
    public String uc9_searchAndDelete(int position, int data) {
        int n = 0;
        Node node = new Node(data);
        Node temp = head; //feeding head to the temp node
        while (n != (position - 1))
        {
            temp = temp.next;
            n++;
        }
        temp.next = temp.next.next;
        return "Deleted "+node.data+" from position "+position;
    }
    public void uc10_sorting()
    {
        Node node;
        Node newnode;
        int temp;
        for (node = this.head; node.next != null; node = node.next) //looping through the nodes one by one eg: 56, 30, 40, 70
        {
            for (newnode = node.next; newnode != null; newnode = newnode.next) //new node which has the node.next eg: 30
            {
                if (node.data > newnode.data) //if 56 > 30 //30 > 56 false //30 > 70 false
                {
                    temp = node.data; //temp = 56 now node.data is empty
                    node.data = newnode.data; // storing 30 in node.data
                    newnode.data = temp; // newnode.data = 56
                }
            }
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
