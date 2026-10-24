package org.zharnitsky.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void defaultFirstTest() {
    var n = 0;
    var expected = 0;
    var actual = Fibonacci.fibonacci(n);

    assertEquals(expected, actual);
  }

  @Test
  void defaultSecondTest() {
    var n = 1;
    var expected = 1;
    var actual = Fibonacci.fibonacci(n);

    assertEquals(expected, actual);
  }

  @Test
  void defaultThirdTest() {
    var n = 1;
    var expected = 1;
    var actual = Fibonacci.fibonacci(n);

    assertEquals(expected, actual);
  }

  @Test
  void defaultFourthTest() {
    var n = 10;
    var expected = 55;
    var actual = Fibonacci.fibonacci(n);

    assertEquals(expected, actual);
  }

  @Test
  void maxBoundaryTest() {
    var n = 40;
    var expected = 102_334_155;
    var actual = Fibonacci.fibonacci(n);

    assertEquals(expected, actual);
  }
}