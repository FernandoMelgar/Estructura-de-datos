package com.actividad04;

import java.util.Arrays;
import java.util.NoSuchElementException;



import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 *
 * @author Julio Arriaga
 * @param <E>
 */
public class SLinkedList<E> implements ListInterface<E> {

  private Node<E> top;
  private int numElements;

  public SLinkedList(){
    this.top = new Node<>(null);
    numElements = 0;
  }

  @Override
  public void addFirst(E entry) {
    Node<E> newNode = new Node<>(entry);
    newNode.next = top.next;
    top.next = newNode;
    numElements++;
  }

  @Override
  public void addLast(E entry) {
    Node<E> i = top;
    while(i.next != null){
      i = i.next;
    }
    i.next = new Node<>(entry);
    numElements++;

  }

  @Override
  // Actividad
  public void add(int index, E entry) {
    Node<E> newNode = new Node<>(entry);
    if (index > numElements)
      throw new IndexOutOfBoundsException();
    Node<E> last = top.next;
    int i = 0;
    if (index == 0){
      newNode.next = top.next;
      top.next = newNode;
      numElements++;
    }
    else {
      while(last.next != null && i < index){
        last = last.next;
        i++;
      }
      newNode.next = last.next;
      last.next = newNode;
      numElements++;
    }
  }

  @Override
  public E removeFirst() {
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    E element = top.next.data;
    top.next = top.next.next;
    numElements--;
    return element;
  }

  @Override
  // Actividad
  public E removeLast() {
    if(isEmpty())
      throw new NoSuchElementException("La lista está vacía.");
    Node<E> last = top.next;
    if (numElements == 1){
      Node<E> toRemove = top.next;
      numElements--;
      top.next = null;
      return  toRemove.data;
    }
    for (int i = 0; i < numElements - 2; i++)
      last = last.next;
    Node<E> toRemove = last.next;
    last.next = null;
    numElements--;
    return toRemove.data;
  }

  @Override
  // Actividad
  public E remove(int index) {

    if(isEmpty())
      throw new NoSuchElementException("La lista está vacía.");
    if(index >= numElements)
      throw new IndexOutOfBoundsException("El índice no está en la lista.");
    Node<E> last = top.next;
    for (int i = 0; i < index - 1; i++) {
      last = last.next;
    }
    E toRemove = null;
    if(last.next != null){
      toRemove = last.next.data;
      last.next = last.next.next;
    }
    numElements--;
    return toRemove;
  }

  @Override
  // Actividad
  public boolean remove(E entry) {
    if(isEmpty()){
      throw new NoSuchElementException("La lista está vacía.");
    }
    Node<E> last = top.next;
    while(last.next != null){
      if( last.next.data.equals(entry)){
        last.next = last.next.next;
        numElements--;
        return true;
      }else{
        last = last.next;
      }
    }
    return false;
  }

  @Override
  public E getFirst() {
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    return top.next.data;
  }

  @Override
  public E getLast() {
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    Node<E> i = top;
    while(i.next != null){
      i = i.next;
    }
    return i.data;
  }


  @Override
  public E get(int index) {
    Node<E> i = top.next;
    int indice = 0;
    if(index > numElements){
      throw new NullPointerException("El índice no está en la lista.");
    }
    while(i != null){
      if(indice == index){
        return i.data;
      }
      i = i.next;
      indice++;
    }
    return null;
  }

  @Override
  public void set(int index, E entry) {
    Node<E> i = top.next;
    int indice = 0;
    if(index > numElements){
      throw new IndexOutOfBoundsException("El índice no está en la lista.");
    }
    while(i != null){
      if(indice == index){
        i.data = entry;
      }
      i = i.next;
      indice++;
    }
  }

  @Override
  public boolean contains(E entry) {
    Node<E> i = top.next;
    while(i != null){
      if(i.data.equals(entry)){
        return true;
      }
      i = i.next;
    }
    return false;
  }

  @Override
  public int indexOf(E entry) {
    Node<E> i = top.next;
    int index = 0; //Cuando i le apunta a top, estamos en -1. por eso empezamos en ese valor.
    while(i != null){
      if(i.data.equals(entry)){
        return index;
      }
      i = i.next;
      index++;
    }
    return -1; //Por convención de Java, si no encontramos el valor, regresmos -1.
  }

  @Override
  public void clear() {
    this.top = new Node<>(null);
    numElements = 0;
  }

  @Override
  public int size() {
    return numElements;
  }

  @Override
  public boolean isEmpty() {
    //Si no tuvieramos nuestra chingona variable numElements tenemos que revisar si la cabeza le apunta a la cola o no.
    //return top.next == null;
    return numElements == 0;
  }

  public void union(SLinkedList<E>otherLst){
    Node<E> i = otherLst.top.next;
    Node<E> last = top.next;
    while(last.next != null){
      last = last.next;
    }
    last.next = i;
    numElements += otherLst.numElements;
  }

  public void reverse(){
    int iter = numElements;
    for (int i = 0; i < iter; i++) {
      this.add(i,this.removeLast());
    }
    this.addLast(this.remove(1));
  }

  @Override
  @SuppressWarnings("unchecked")
  public E[] toArray() {
    E[] arrayList = (E[]) new Object[numElements]; //Creamos un nuevo arreglo con tamaño de numElements para ahí meter nuestra lista y poder
    //imprimirla en formato de arreglo.
    Node<E> i = top.next;
    int index = 0;
    while(i != null){
      arrayList[index] = i.data;
      i = i.next;
      index++;
    }
    return arrayList;
  }

  @Override
  public String toString(){
    return Arrays.toString(toArray());
  }

}

