package org.zharnitsky.solutions;

import java.util.stream.IntStream;

/**
 * Простое число (Is Prime)
 * <p>
 * Условие: Дано целое неотрицательное число n. Определите, является ли оно простым. Простое число
 * больше 1 и делится без остатка только на 1 и на само себя. Числа 0 и 1 простыми не считаются.
 * <p>
 * Входные данные: Одно целое число n.
 * <p>
 * Выходные данные: true, если n простое, иначе false.
 * <p>
 * Ограничения:
 * <p>
 * 0 ≤ n ≤ 10^9
 * <p>
 * Решение должно работать быстрее, чем перебор всех делителей от 2 до n (достаточно O(√n)).
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
