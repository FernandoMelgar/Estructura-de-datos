package com.actividad05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosfixStacksTest {

  @BeforeEach
  void setUp() {
  }

  @Test
  void evaluatePosfix() {
    PosfixStacks posfixStacks = new PosfixStacks();
    assertEquals(2, posfixStacks.evaluatePosfix("2 3 4 * 5 * -"));
  }

  @Test
  void invertStackByArray() {
  }


}