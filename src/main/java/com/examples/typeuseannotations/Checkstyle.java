package com.examples.typeuseannotations;

/** testing. */
public class Checkstyle {
  final @TypeUseAnnotation String name = "xyz";

  @TypeUseAnnotation final int xyz = 90;

  @TypeUseAnnotation public int test() {
    return 0;
  }

  public @TypeUseAnnotation int test2() {
    return 10;
  }
}

/*
 * CLI OUPUT:-
 * java -jar ..\checkstyle-10.17.0-all.jar -c ..\google_checks.xml .\Checkstyle.java
 * Starting audit...
 * Audit done.
 *
 * Line 9 should give warning, it is false negative.
 * Line 7 should also give warning, but I'm not so sure about it....
 */
