package com.recursion;

import java.util.Stack;

public class HanoiTower {
  public static void play(Stack<Integer> from, Stack<Integer> to, Stack<Integer> other, int n){
    if (n > 1) play(from, other, to, n - 1);
    to.push(from.pop());
    if (n > 1) play(other, to, from, n - 1);
  }

}
