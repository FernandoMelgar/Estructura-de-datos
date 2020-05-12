package com.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class PriorityQueue<E extends  Comparable<? super E>> implements QueueInterface<E> {
  private Node<E> firstNode, lastNode;
  private int numElements;

  public PriorityQueue(){
    numElements = 0;
    firstNode = null;
    lastNode = null;
  }

  @Override
  public void enqueue(E newEntry) {
    Node<E> newNode = new Node<>(newEntry);
    if(isEmpty()){
      firstNode = newNode;
    }else{
      lastNode.next = newNode;
    }
    lastNode = newNode;
    numElements++;
  }

  @Override
  public E dequeue() {
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    E element = firstNode.data;
    firstNode = firstNode.next;
    numElements--;
    return element;
  }

  @Override
  public E getFront() {
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    E element = firstNode.data;
    return element;
  }

  @Override
  public boolean isEmpty() {
    return numElements == 0;
  }

  @Override
  public void clear() {
    numElements = 0;
    firstNode = null;
    lastNode = null;
  }

  @Override
  public E[] toArray() {
    @SuppressWarnings("unchecked")
    E[] queue = (E[])new Object[numElements];
    Node<E> n = firstNode;
    int i = 0;
    while(n != null){
      queue[i] = n.data;
      n = n.next;
      i++;
    }
    return queue;
  }

  @Override
  public String toString(){
    return Arrays.toString(toArray());
  }

  @Override
  public int size() {
    return numElements;
  }
}
