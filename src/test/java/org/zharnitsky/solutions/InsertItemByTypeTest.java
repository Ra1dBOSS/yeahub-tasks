package org.zharnitsky.solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class InsertItemByTypeTest {

  @Test
  void defaultTest() {
    var expected = new Item[]{
        new Item("A", "1"),
        new Item("A", "new"),
        new Item("B", "1"),
        new Item("A", "2"),
        new Item("B", "2")
    };
    var items = new Item[]{
        new Item("A", "1"),
        new Item("B", "1"),
        new Item("A", "2"),
        new Item("B", "2")
    };

    var newItem = new Item("A", "new");
    var position = 1;
    var actual = InsertItemByType.insertItemByType(items, newItem, position);

    assertArrayEquals(expected, actual);
  }
  @Test
  void typeNullTest() {
    var expected = new Item[]{
        new Item(null, "1"),
        new Item(null, "new"),
        new Item("B", "1"),
        new Item("A", "2"),
        new Item("B", "2")
    };
    var items = new Item[]{
        new Item(null, "1"),
        new Item("B", "1"),
        new Item("A", "2"),
        new Item("B", "2")
    };

    var newItem = new Item(null, "new");
    var position = 1;
    var actual = InsertItemByType.insertItemByType(items, newItem, position);

    assertArrayEquals(expected, actual);
  }
  @Test
  void positionIsNegativeTest() {
    var expected = new Item[]{
        new Item("A", "new"),
        new Item("A", "1"),
        new Item("B", "1"),
        new Item("A", "2"),
        new Item("B", "2")
    };
    var items = new Item[]{
        new Item("A", "1"),
        new Item("B", "1"),
        new Item("A", "2"),
        new Item("B", "2")
    };

    var newItem = new Item("A", "new");
    var position = -1;
    var actual = InsertItemByType.insertItemByType(items, newItem, position);

    assertArrayEquals(expected, actual);
  }
  @Test
  void positionIsMoreThanGroupSizeTest() {
    var expected = new Item[]{
        new Item("A", "1"),
        new Item("B", "1"),
        new Item("A", "2"),
        new Item("A", "new"),
        new Item("B", "2")
    };
    var items = new Item[]{
        new Item("A", "1"),
        new Item("B", "1"),
        new Item("A", "2"),
        new Item("B", "2")
    };

    var newItem = new Item("A", "new");
    var position = 10;
    var actual = InsertItemByType.insertItemByType(items, newItem, position);

    assertArrayEquals(expected, actual);
  }
}