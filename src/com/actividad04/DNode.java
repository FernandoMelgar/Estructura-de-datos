package com.actividad04;


/**
 * Doubly linked Node
 * @author Julio Arriaga
 * @param <E> the type of element being stored
 */
public class DNode<E> {

  E data;
  DNode<E> prev;
  DNode<E> next;

  public DNode(E data){
    this.data = data;
    prev = null;
    next = null;
  }

  @Override
  public String toString(){
    return data.toString();
  }

}