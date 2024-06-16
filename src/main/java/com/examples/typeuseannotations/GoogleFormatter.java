package com.examples.typeuseannotations;

/** testing. */
public class GoogleFormatter {
  final @TypeUseAnnotation String name = "xyz";

  @TypeUseAnnotation final int xyz = 90;

  @TypeUseAnnotation
  public int test() {
    return 0;
  }

  public @TypeUseAnnotation int test2() {
    return 10;
  }
}
