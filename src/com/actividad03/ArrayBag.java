package com.actividad03;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * An implementation of a Bag, using an array
 * @author Julio Arriaga
 */
public class ArrayBag<T> implements BagInterface<T> {

  protected T[] bag;
  protected int size;
  protected static final int DEFAULT_SIZE = 10;
  protected int numElements;

  public ArrayBag(int size){
    this.size = size;
    bag = (T[]) new Object[size];
    numElements = 0;
  }

  public ArrayBag(){
    this(DEFAULT_SIZE);
  }

  @Override
  public int getCurrentSize() {
    return numElements;
  }

  @Override
  public boolean isEmpty() {
    return numElements == 0;
  }

  @Override
  public boolean isFull() {
    return numElements == size;
  }

  @Override
  public boolean add(T newEntry) {
    if(isFull()){
      return false;
    }
    bag[numElements] = newEntry;
    numElements++;
    return true;
  }

  @Override
  public void clear() {
    numElements = 0;
  }

  @Override
  public T remove() {
    if(isEmpty()){
      throw new NoSuchElementException("La bolsa esta vacia");
    }
    numElements--;
    return bag[numElements];
  }

  @Override
  public void remove(T anEntry) {
    for(int i = 0; i < numElements; i++){
      if(bag[i].equals(anEntry)){
        numElements--;
        bag[i] = bag[numElements];
        return;
      }
    }
    throw new NoSuchElementException("El elemento no esta en la bolsa");
  }

  @Override
  public int getFrequencyOf(T anEntry) {
    int frequency = 0;
    for(int i=0;i<numElements;i++){
      if(bag[i].equals(anEntry)){
        frequency++;
      }
    }
    return frequency;
  }

  @Override
  public boolean contains(T anEntry) {
    return getFrequencyOf(anEntry) > 0;
  }

  @Override
  public T[] toArray() {
    return Arrays.copyOf(bag, numElements);
  }

  @Override
  public String toString(){
    return Arrays.toString(toArray());
  }

}

