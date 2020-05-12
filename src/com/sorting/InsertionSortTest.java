package com.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  public void test_comparableClass(){
    Integer six = 6;
    Integer nine = 9;
    assertEquals(1, nine.compareTo(six));
    assertEquals(-1, six.compareTo(nine));
  }
}