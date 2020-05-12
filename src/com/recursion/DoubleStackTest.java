package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleStackTest {
  DoubleStack<Integer> doubleStack;

  @BeforeEach
  void setUp() {
    doubleStack = new DoubleStack<>(5);
    doubleStack.push(1,10);
    doubleStack.push(1,20);
    doubleStack.push(2,50);
  }

  @Test
  public void test_addElemToLeft(){
    System.out.println("doubleStack = " + doubleStack);
  }
  @Test
  public void test_popLeft(){
    doubleStack.pop(1);
    doubleStack.pop(1);
    doubleStack.pop(2);
    System.out.println("doubleStack = " + doubleStack);
  }
}