package com.recursion;

import java.util.NoSuchElementException;

public class DoubleStack<T> {

  private final int SIZE;
  private T[] stack;
  private int t1, t2, numElements;

  @SuppressWarnings("unchecked")
  public DoubleStack(int size) {
    t1 = 0;
    SIZE = size;
    t2 = SIZE - 1;
    numElements = 0;
    stack = (T[]) new Object[SIZE];
  }

  public void push(int s, T entry) {
    if (numElements == SIZE) throw new IndexOutOfBoundsException();
    if (s == 1) stack[t1++] = entry;
    else  stack[t2--] = entry;
    numElements++;
  }

  public T pop(int s) {
    T elem;
    if(numElements == 0) throw new NoSuchElementException();
    if(s == 1) {
      elem = stack[t1];
      stack[--t1] = null;
    }
    else{
      elem = stack[t2];
      stack[++t2] = null;
    }
    numElements--;
    return elem;
  }

  public boolean isEmpty(int s){
    if(s==1)return t1==0;
    else return t2==SIZE-1;
  }

  @Override
  public String toString() {
    String str = "Stack1: ";
    for(int i=t1-1;i>=0;i--){
      str += stack[i] + " ";
    }
    str += "| Stack2: ";
    for(int i=t2+1;i<stack.length;i++){
      str += stack[i] + " ";
    }
    return str;
  }
}
