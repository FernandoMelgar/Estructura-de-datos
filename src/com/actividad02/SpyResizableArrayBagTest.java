package com.actividad02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpyResizableArrayBagTest {

  SpyResizableArrayBag<String> spyBag;

  @BeforeEach
  void setUp() {
    spyBag = new SpyResizableArrayBag<>();
  }

  @Test
  public void test_create_elementwith11Items_checkSizeIs20(){
      addItems(11);
      assertEquals(20, spyBag.getSize());
  }
  @Test
  public void test_sizeWith145Items_is160(){
      addItems(145);
      assertEquals(160, spyBag.getSize());
  }

  @Test
  public void test_sizeWith165Items_is320(){
    addItems(165);
    assertEquals(320, spyBag.getSize());
  }

  private void addItems(int n){
    for (int i = 0; i < n; i++)
       spyBag.add("item " + i);
  }
}