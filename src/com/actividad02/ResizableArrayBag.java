package com.actividad02;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static java.lang.System.arraycopy;

public class ResizableArrayBag<T> implements BagInterface<T> {
  private T[] bag;
  protected int size;
  private int numElements;
  private static final int DEFAULT_SIZE = 10;

  public ResizableArrayBag(int size){
    this.size = size;
    bag = (T[]) new Object[size];
    numElements = 0;
  }

  public ResizableArrayBag(){
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
    if(isFull())
      updateBagSize();
    bag[numElements] = newEntry;
    numElements++;
    return true;
  }

  private void updateBagSize(){
    size = numElements * 2;
    T[] nBag = (T[]) new Object[size];
    arraycopy(bag, 0, nBag, 0, bag.length);
    bag  = nBag;

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
    for(int i=0; i <= numElements;i++){
      if(bag[i].equals(anEntry)){
        numElements--;
        bag[i] = bag[numElements];
        return;
      }
    }
    throw new NoSuchElementException("El elemento no esta en la bolsa");
  }

  public void removeEvery(T anEntry){
    for (int i = 0; i <= getFrequencyOf(anEntry); i++) {
      remove(anEntry);
    }
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
    for(int i = 0; i < numElements; i++)
      if (bag[i].equals(anEntry))
        return true;
    return false;
  }

  @Override
  public T[] toArray() {
    return Arrays.copyOf(bag, numElements);
  }

  @Override
  public String toString(){
    if(numElements == 0)
      return "La bolsa está vacía!";
    return Arrays.toString(toArray());
  }
}
