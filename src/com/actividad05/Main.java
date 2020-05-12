package com.actividad05;

import java.util.Arrays;
import java.util.Stack;

class Main {
  public static void main(String[] args) {
    Stack<Integer> s1 = new Stack<>();
    for (int i = 10; i < 100; i += 10) {
      s1.push(i);
    }
    s1.push(20);
    s1.push(1000);
    s1.push(20);
    System.out.println("Testing remove");
    System.out.println("Stack = " + s1);
    removeAllInstances(s1, 20);
    System.out.println("Stack after removing every 20 = " + s1);

    System.out.println("\nTesting reverse");
    System.out.println("Stack = " + s1);
    reverse(s1);
    System.out.println("Stack after reverse = " + s1);

    System.out.println("\nTesting palindrome");
    Integer[] a1 = {1, 0, 0, 1, 1, 0, 0, 1};
    Character[] a2 = {'a', 'n', 'i', 't', 'a', 'l', 'a', 'v', 'a', 'l', 'a', 't', 'i', 'n', 'a'};
    System.out.println(Arrays.toString(a1) + " is palindrome? " + palindrome(a1));
    System.out.println(Arrays.toString(a2) + " is palindrome? " + palindrome(a2));
    a1[0] = 0;
    System.out.println(Arrays.toString(a1) + " is palindrome? " + palindrome(a1));

    System.out.println("\nTesting evaluatePosfix");
    System.out.println("2 4 / = " + evaluatePosfix("2 4 /"));
    System.out.println("2 4 + 3 / = " + evaluatePosfix("2 4 + 3 /"));
    System.out.println("2 3 4 * 5 * - = " + evaluatePosfix("2 3 4 * 5 * -"));
    System.out.println("2 3 4 ^ 5 / = " + evaluatePosfix("2 3 4 + ^ 5 /"));
    System.out.println("6 3 4 2 ^ * + 5 = " + evaluatePosfix("6 3 4 2 ^ * + 5 -"));

  }

  public static <E> void removeAllInstances(Stack<E> stk, E entry){

  }

  public static <E> void reverse(Stack<E> stk){

  }

  public static <E> boolean palindrome(E[] a){
    return false;
  }

  public static double evaluatePosfix(String expression) {
    return 0;
  }

}