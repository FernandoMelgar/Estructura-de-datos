package com.examen01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimpleListTest {

  SimpleList<Integer> a;
  SimpleList<Integer> b;
  SimpleList<Integer> c;

  @BeforeEach
  void setUp() {

  }

  @Test
  public void test_superSet(){
    initListValues();
    a.superset(b);
    assertFalse(a.superset(b));
  }

  @Test
  public void test_superset02(){
      initListValues();
      assertTrue(b.superset(a));
  }


  public void initListValues(){
    a = new SimpleList<>();
    b = new SimpleList<>();
    Integer[] v1 = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Integer[] v2 = new Integer[]{5, 4, 3, 2, 1, 0, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    addItems(v1,a);
    addItems(v2,b);
  }
  public void addItems(Integer[] items, SimpleList<Integer> list){
    for (Integer item : items) {
      list.addLast(new Integer(item));
    }
  }

}