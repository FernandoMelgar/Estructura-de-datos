package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class HanoiTowerTest {

  public Stack<Integer> A;
  public Stack<Integer> B;
  public  Stack<Integer> C;
  public Stack<Integer> testStack;

  @BeforeEach
  void setUp() {
  }

  @Test
  public void test_sizeOneHanoiTower(){
    A = new Stack<>(); A.push(1);
    testStack = (Stack<Integer>) A.clone();
    B = new Stack<>();
    C = new Stack<>();
    testPlayHanoi(1);
  }
  @Test
  public void test_TwoHanoiTower(){
    A = new Stack<>(); A.push(2); A.push(1);
    testStack = (Stack<Integer>) A.clone();
    B = new Stack<>();
    C = new Stack<>();
    testPlayHanoi(2);

  }
  @Test
  public void test_ThreeHanoiTower(){
    A = new Stack<>(); A.push(3); A.push(2); A.push(1);
    testStack = (Stack<Integer>) A.clone();
    B = new Stack<>();
    C = new Stack<>();
    testPlayHanoi(3);
  }

  private void testPlayHanoi(int n) {
    System.out.println("A = " + A + " B = " + B + " C = " + C);
    HanoiTower.play(A,B,C, n);
    assertStackEquals(testStack, B);
    System.out.println("A = " + A + " B = " + B + " C = " + C);
  }


  private void assertStackEquals(Stack<Integer> testStack, Stack<Integer> b) {
    System.out.println("testStack = " + testStack + " b " + b );
    assertEquals(testStack.size(),b.size());
    for (int i = 0; i < testStack.size(); i++) {
      assertEquals(testStack.pop(), b.pop());
    }
  }
}
