package com.examen02;

import java.util.Arrays;
import java.util.Stack;

public class Shuffler {

  public static void  stackShuffle(int[] a) {
    Stack<Integer> right = arrayToStack(a, a.length - 1, a.length/2);
    Stack<Integer> left = arrayToStack(a, a.length/2 - 1,0);
    for (int i = 0; i < a.length; i++) {
      if (i % 2 == 0) a[i] = left.pop();
      else a[i] = right.pop();
    }
  }

  public static Stack<Integer> arrayToStack(int[] array,int fromIndex, int toIndex){
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = fromIndex; i >= toIndex; i--) {
      stack.push(array[i]);
    }
    return stack;
  }
}
