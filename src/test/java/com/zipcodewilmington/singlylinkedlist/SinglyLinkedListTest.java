package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList singlyLinkedList;
    @Before
    public void setUp() throws Exception {
        singlyLinkedList = new SinglyLinkedList();
    }

    @Test
    public void addTest() {
        singlyLinkedList.add("String");
        Integer expected = 1;
        Integer actual = singlyLinkedList.size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void sizeTest() {
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(100);
        Integer expected = 3;
        Integer actual = singlyLinkedList.size();

        Assert.assertEquals(expected,actual);

    }
    @Test
    public void sizeTestNull() {
        Integer expected = null;
        Integer actual = singlyLinkedList.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest() {
        singlyLinkedList.add("First Item");
        singlyLinkedList.add("Second");
        singlyLinkedList.add("Puppy");
        singlyLinkedList.removeByIndex(1);
        Integer expected = 2;
        Integer actual = singlyLinkedList.size();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void containsTest() {
        singlyLinkedList.add("String");
        singlyLinkedList.add("another");

        Assert.assertTrue(singlyLinkedList.contains("String"));
    }

    @Test
    public void containsTest1() {
        singlyLinkedList.add("String");
        singlyLinkedList.add("another");

        Assert.assertFalse(singlyLinkedList.contains("lalalal"));
    }

    @Test
    public void findTest() {
        singlyLinkedList.add("String");
        singlyLinkedList.add("another");
        singlyLinkedList.add("yaaaa");

        Integer expected = 1;
        Integer actual = singlyLinkedList.find("another");

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void findTest1() {
        singlyLinkedList.add("String");
        singlyLinkedList.add("another");
        singlyLinkedList.add("yaaaa");

        Integer expected = -1;
        Integer actual = singlyLinkedList.find("lalala");

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTest() {
        singlyLinkedList.add("String");
        singlyLinkedList.add("another");
        singlyLinkedList.add("yaaaa");

        String expected = "String";
        String actual = singlyLinkedList.get(0).toString();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getTest1() {
        singlyLinkedList.add("String");
        singlyLinkedList.add("another");
        singlyLinkedList.add("ya");

        String expected = "ya";
        String actual = singlyLinkedList.get(2).toString();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void copyTest() {
        SinglyLinkedList test = new SinglyLinkedList();
        test.add(1);
        test.add(1);
        test.add(1);

        List actual = singlyLinkedList.copy(test);

        Assert.assertEquals(test,actual);
    }
}
