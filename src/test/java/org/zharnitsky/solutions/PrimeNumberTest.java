package org.zharnitsky.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberTest {

  @Test
  void defaultFirstTest() {
    var n = 17;
    var result = PrimeNumber.isPrime(n);

    assertTrue(result);
  }

  @Test
  void defaultSecondTest() {
    var n = 100;
    var result = PrimeNumber.isPrime(n);

    assertFalse(result);
  }

  @Test
  void minBoundaryTest() {
    var n = 0;
    var result = PrimeNumber.isPrime(n);

    assertFalse(result);
  }

  @Test
  void maxBoundaryTest() {
    var n = 1000_000_000;
    var result = PrimeNumber.isPrime(n);

    assertFalse(result);
  }

  @Test
  void nIs2Test() {
    var n = 2;
    var result = PrimeNumber.isPrime(n);

    assertTrue(result);
  }

  @Test
  void nIs3Test() {
    var n = 3;
    var result = PrimeNumber.isPrime(n);

    assertTrue(result);
  }

  @Test
  void nIs4Test() {
    var n = 4;
    var result = PrimeNumber.isPrime(n);

    assertFalse(result);
  }

  @Test
  void nIs5Test() {
    var n = 5;
    var result = PrimeNumber.isPrime(n);

    assertTrue(result);
  }

  @Test
  void nIs7Test() {
    var n = 7;
    var result = PrimeNumber.isPrime(n);

    assertTrue(result);
  }

  @Test
  void nIs10Test() {
    var n = 10;
    var result = PrimeNumber.isPrime(n);

    assertFalse(result);
  }

  @Test
  void nIs11Test() {
    var n = 11;
    var result = PrimeNumber.isPrime(n);

    assertTrue(result);
  }
}