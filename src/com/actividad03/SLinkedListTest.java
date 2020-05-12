package com.actividad03;

import org.junit.jupiter.api.Test;

class SLinkedListTest {


  @Test
  public void test_addElementInGivenPosition(){
      SLinkedList<Integer> linkedList = new SLinkedList<>();
      linkedList.addFirst(3);
      linkedList.addFirst(4);
      linkedList.addFirst(5);
      linkedList.add(1,10);
    System.out.println("linkedList = " + linkedList);
  }
  
  @Test
  public void test_removing_last_element(){
    SLinkedList<Integer> linkedList = new SLinkedList<>();
    linkedList.addFirst(3);
    linkedList.addFirst(4);
    linkedList.addFirst(5);
    linkedList.removeLast();
    System.out.println("linkedList = " + linkedList);
}

  @Test
  public void test_removeInSpecificIndex(){
    SLinkedList<Integer> linkedList = new SLinkedList<>();
    linkedList.addFirst(6);
    linkedList.addFirst(5);
    linkedList.addFirst(4);
    linkedList.remove(2);
    System.out.println("linkedList = " + linkedList);
  }
  
  @Test
  public void test_unionOfTwoList(){
    SLinkedList<Integer> linkedList1 = new SLinkedList<>();
    linkedList1.addFirst(6);
    linkedList1.addFirst(5);
    linkedList1.addFirst(4);
    linkedList1.addFirst(3);
    linkedList1.addFirst(2);
    linkedList1.addFirst(1);
    linkedList1.removeLast();
    linkedList1.removeLast();
    linkedList1.removeLast();
    linkedList1.removeLast();
    linkedList1.removeLast();
    linkedList1.removeLast();
    System.out.println("linkedList1 = " + linkedList1);
  }
  @Test
  public void test_addElemInZeroIndex(){

    SLinkedList<Integer> linkedList1 = new SLinkedList<>();
    linkedList1.add(0,1);
  }
  
  @Test
  public void test_removeElement(){
    SLinkedList<Integer> linkedList1 = new SLinkedList<>();
    linkedList1.addFirst(6);
    linkedList1.addFirst(5);
    linkedList1.addFirst(4);
    linkedList1.addFirst(3);
    linkedList1.addFirst(2);
    linkedList1.addFirst(1);
    linkedList1.remove(new Integer(6));
    System.out.println("linkedList1 = " + linkedList1);
  }
  
  @Test
  public void test_reverse(){
    SLinkedList<Integer> linkedList1 = new SLinkedList<>();
    for(int i=0;i<10;i++){
      linkedList1.addFirst(i);
    }
    linkedList1.reverse();
    System.out.println("linkedList1 = " + linkedList1);
  }

  @Test
  public void test_getTotalBYIndex(){
    SLinkedList<Integer> linkedList1 = new SLinkedList<>();
    for (int i = 0; i < 10; i++) {
      linkedList1.add(i, i * 2);
    }

    System.out.println("Testing: size + indexOf + get");
    for (int i = 0; i < linkedList1.size(); i++) {
      System.out.println("Get element at index " + linkedList1.indexOf(linkedList1.get(i)) + ": " + linkedList1.get(i));
    }
  }
}