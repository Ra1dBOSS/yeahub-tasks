package org.zharnitsky.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberTest {

  @Test
  void defaultFirstTest() {
    var n = 17;
    var expected = true;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void defaultSecondTest() {
    var n = 100;
    var expected = false;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void minBoundaryTest() {
    var n = 0;
    var expected = false;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void maxBoundaryTest() {
    var n = 1000_000_000;
    var expected = false;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void nIs2Test() {
    var n = 2;
    var expected = true;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void nIs3Test() {
    var n = 3;
    var expected = true;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void nIs4Test() {
    var n = 4;
    var expected = false;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void nIs5Test() {
    var n = 5;
    var expected = true;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void nIs7Test() {
    var n = 7;
    var expected = true;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void nIs10Test() {
    var n = 10;
    var expected = false;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }

  @Test
  void nIs11Test() {
    var n = 11;
    var expected = true;
    var actual = PrimeNumber.isPrime(n);

    assertEquals(expected, actual);
  }
}