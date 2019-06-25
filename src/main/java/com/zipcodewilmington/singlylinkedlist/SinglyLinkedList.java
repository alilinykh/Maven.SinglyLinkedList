package com.zipcodewilmington.singlylinkedlist;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T> {
    Node head;

    public class Node {
        private T data;
        private Node next;
    }

    public void add(T data){

        Node node = new Node();
        node.data  = data;
        node.next = null; //optional

        if(head == null) {
            head = node;
        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public Integer size() {
        Integer counter = 1;
        if (head == null) {
            return null;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
                counter++;
            }
        }
        return counter;
    }

    public void removeByIndex(Integer index){
        Node node = new Node();
        node.next = null; //optional

        if (index == 0) {
            head = head.next;
        }
        else {
            Node n = head;

            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node n1 = n.next;
            n.next = n1.next;
        }
    }

    public Boolean contains(T value){
        if (head == null) {return false;}
        else {
            Node n = head;
            while (n.next != null) {
                if (n.data.equals(value)) {
                    return true;
                }
                n = n.next;
            }
        }
        return false;
    }

    public Integer find (T value){
        Node node = new Node();
        node.next = null; //optional
        Integer counter = 0;

            Node n = head;
            while (n.next != null) {
                if (n.data.equals(value)) {
                    return counter;
                }
                n = n.next;
                counter++;
            }
        return -1;
    }

    public T get(Integer index){
        Node node = new Node();
        node.next = null;
        Node n = head;

        if (index == 0) {
            return n.data;
        }
        else {
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
            return n.data;
        }
    }

    public SinglyLinkedList copy(SinglyLinkedList list){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node = new Node();
        node.next = null;
//        Node n = head;
        if (list.head == null) {
            singlyLinkedList.head = node;
        }
        else {
            Node n = list.head;
            singlyLinkedList.add(list.head.data);
            while (n.next != null) {
                n = n.next;
                singlyLinkedList.add(n.data);
            }
        }

        return singlyLinkedList;
    }

    public SinglyLinkedList sort(SinglyLinkedList list){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node node = new Node();
        node.next = null;

        Node n = list.head;
        Node n1 = n.next;
        if ((Integer)n.data > (Integer) n1.data)  {
            singlyLinkedList.add(n.data);
        }
        else {
            singlyLinkedList.add(n1.data);
        }
        Integer counter = list.size()-1;
        while (counter > 0) {
            n = n.next;
            n1 = n.next;
            if ((Integer)n.data > (Integer) n1.data)  {
                singlyLinkedList.add(n.data);
            }
            else {
                singlyLinkedList.add(n1.data);
            }
            counter--;
        }

        return singlyLinkedList;
    }





    //optional
    public void reverse(T value){}
    public void slice(T value){}
}
