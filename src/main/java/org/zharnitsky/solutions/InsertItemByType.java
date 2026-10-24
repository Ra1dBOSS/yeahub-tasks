package org.zharnitsky.solutions;

import java.util.stream.IntStream;

/**
 * Вставка элемента по типу (Insert Item By Type)
 * <p>
 * Условие: Дан массив элементов, где каждый элемент — объект с полями type (строка) и value
 * (строка). Элементы одного и того же type в массиве расположены подряд (сгруппированы), в порядке
 * появления групп.
 * <p>
 * Нужно вставить новый элемент в массив так, чтобы внутри своей группы (среди элементов с тем же
 * type) он оказался на позиции, заданной третьим аргументом — это индекс внутри группы, а не индекс
 * во всём массиве.
 * <p>
 * Если позиция отрицательная — элемент должен стать первым в своей группе. Если позиция больше или
 * равна количеству элементов этого типа — элемент должен стать последним в своей группе.
 * Гарантируется, что хотя бы один элемент с таким же type, как у вставляемого, уже есть в массиве.
 * <p>
 * Функция возвращает новый массив с учётом вставки.
 * <p>
 * Входные данные: items — массив объектов { type: string, value: string }, от 1 до 1000 элементов,
 * элементы одного type идут подряд newItem — объект { type: string, value: string } для вставки
 * position — целое число, индекс внутри группы своего типа (может быть отрицательным или больше
 * размера группы)
 * <p>
 * Выходные данные:
 * <p>
 * Массив объектов { type: string, value: string } — исходный массив с вставленным элементом.
 * <p>
 * Ограничения:
 * <p>
 * 1 <= items.length <= 1000
 * <p>
 * в items уже есть хотя бы один элемент с type, равным newItem.type
 * <p>
 * position — любое целое число
 *
 * @link <a href="https://app.yeahub.ru/tasks/d9c194a4-c11f-4e50-9b0d-9d822c261ea2">Task Link</a>
 */
public class InsertItemByType {

  public static Item[] insertItemByType(Item[] items, Item newItem, int position) {
    var indexes = IntStream.range(0, items.length)
        .filter(i -> (newItem.type() != null && newItem.type().equals(items[i].type())) || (
            newItem.type() == null && items[i].type() == null))
        .boxed()
        .toList();
    var pos = Math.max(0, Math.min(position, indexes.size()));
    var insertIndex = pos == 0 ? indexes.get(0) : indexes.get(pos - 1) + 1;
    return IntStream.rangeClosed(0, items.length)
        .mapToObj(i -> i == insertIndex
            ? newItem
            : i > insertIndex
                ? items[i - 1]
                : items[i])
        .toArray(Item[]::new);
  }

}

record Item(String type, String value) {

}
