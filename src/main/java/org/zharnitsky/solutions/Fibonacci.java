package org.zharnitsky.solutions;


import java.util.stream.Stream;

/**
 * N-е число Фибоначчи (Nth Fibonacci Number)
 * <p>
 * Условие: Последовательность Фибоначчи задаётся так: F(0) = 0, F(1) = 1, а каждое следующее число
 * равно сумме двух предыдущих: F(n) = F(n - 1) + F(n - 2) при n >= 2. Начало последовательности: 0,
 * 1, 1, 2, 3, 5, 8, 13, ...
 * <p>
 * Напишите функцию, которая по номеру n (нумерация с 0) возвращает F(n). Хранить всю
 * последовательность не требуется. Решение должно работать за O(n) по времени и использовать O(1)
 * дополнительной памяти.
 * <p>
 * Входные данные: n — целое неотрицательное число, номер числа Фибоначчи (нумерация с 0)
 * <p>
 * Выходные данные: Целое число — значение F(n)
 * <p>
 * Ограничения:
 * <p>
 * 0 <= n <= 40 (результат помещается в 32-битный int)
 * <p>
 *
 * @link <a href="https://app.yeahub.ru/tasks/6ea3cab8-08ec-4f25-9661-54fa4fe84629">Task link</a>
 */
public class Fibonacci {

  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    return Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]})
        .skip(n - 1)
        .map(x -> x[1])
        .findFirst()
        .orElseThrow(() -> new IllegalArgumentException("n must be >=0"));
  }
}
