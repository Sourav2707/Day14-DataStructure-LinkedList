package com.bridgelabs.day14_linkedlist;

import org.junit.Assert;

public class Main {
    public static void main(String[] args) {
        Day14LinkedList linkedList = new Day14LinkedList();
        String expected = "56, 30, 40, 70";
        linkedList.uc1_add(56);
        linkedList.uc1_add(30);
        linkedList.uc1_add(70);
        linkedList.get();
        linkedList.uc7_search(30);
        linkedList.uc8_searchAndInsert(linkedList.count+1, 40);
        linkedList.get();
        System.out.println(linkedList.testGet.toString());
    }
}
