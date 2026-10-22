package org.zharnitsky.solutions;

import java.util.stream.IntStream;

/**
 * Простое число (Is Prime)
 * <p>
 * Условие: Дано целое неотрицательное число n. Определите, является ли оно простым. Простое число
 * больше 1 и делится без остатка только на 1 и на само себя. Числа 0 и 1 простыми не считаются.
 *
 * @link <a href="https://app.yeahub.ru/tasks/eb90744a-c7ae-4641-8765-969d8347d5dc">...</a>
 */
public class PrimeNumber {

  public static boolean isPrime(int n) {
    if (n > 1) {
      return IntStream.rangeClosed(2, (int) Math.floor(Math.sqrt(n))).noneMatch(x -> n % x == 0);
    }
    return false;
  }
}
