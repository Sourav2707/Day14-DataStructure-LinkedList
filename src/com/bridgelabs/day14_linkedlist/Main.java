package com.bridgelabs.day14_linkedlist;

import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        Day14LinkedList linkedList = new Day14LinkedList();
        linkedList.uc1_add(56);
        linkedList.uc1_add(30);
        linkedList.uc1_add(40);
        linkedList.uc1_add(70);
        linkedList.get();
        linkedList.uc7_search(40);
        System.out.println(linkedList.uc9_searchAndDelete(linkedList.count, 40));
        linkedList.get();
    }
}
