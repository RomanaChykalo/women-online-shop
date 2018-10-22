package com.women.online.shop.utils;

import java.util.Arrays;

public final class StringUtils {

  private StringUtils() {}

  public static boolean isNull(String value) {
    return value == null;
  }

  public static int totalSize(String[] strings) {
    return Arrays.stream(strings)
        .peek(System.out::println)
        .mapToInt(String::length)
        .peek(System.out::println)
        .sum();
  }
}
