package com.women.online.shop.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

  @Test
  public void isNullShouldReturnTrueForNull() {
    final boolean isNull = StringUtils.isNull(null);

    Assert.assertTrue(isNull);
    Assert.assertEquals(true, isNull);
  }

  @Test
  public void isNullShouldReturnFalseForNotNull() {
    final boolean actual = StringUtils.isNull("null");
    final boolean expected = false;

    Assert.assertFalse(actual);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void totalSizeShouldReturnZeroForEmptyArray() {
    final String[] strings = {};
    final int actual = StringUtils.totalSize(strings);
    final int expected = 0;

    Assert.assertEquals(expected, actual);
  }

  @Test
  public void totalSizeShouldReturn38() {
    final String[] strings = {"Олена", "Таня", "Женя", "Рома", "Софія", "Тетяна", "Наталя", "Ната"};
    final int actual = StringUtils.totalSize(strings);
    final int expected = 38;

    Assert.assertEquals(expected, actual);
  }
}
