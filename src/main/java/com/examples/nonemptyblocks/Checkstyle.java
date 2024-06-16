package com.examples.nonemptyblocks;

/** testing. */
public class Checkstyle {
  /** testing. */
  public void method() {
    {
      int x = foo();
      frob(x);
    }
  }

  private void frob(int x) {}

  private int foo() {
    return 10;
  }

  private void test() {

    int no = 23;

    switch (no) {
      case 2: {
        int x = foo();
        frob(x);
        break;
      }

      default:
        frob(no);
    }

    {
      System.out.println("True");
    }
  }

  public int getX() { return 0; }
}

/**
 * CLI OUTPUT:
 *
 * Starting audit...
[WARN] \Checkstyle.java:7:5: 'block lcurly' has incorrect indentation level 4, expected level should be 6. [Indentation]
[WARN] \Checkstyle.java:10:5: 'block rcurly' has incorrect indentation level 4, expected level should be 6. [Indentation]
[WARN] \Checkstyle.java:34:5: 'block lcurly' has incorrect indentation level 4, expected level should be 6. [Indentation]
[WARN] \Checkstyle.java:36:5: 'block rcurly' has incorrect indentation level 4, expected level should be 6. [Indentation]
[WARN] \Checkstyle.java:39:21: '{' at column 21 should have line break after. [LeftCurly]
[WARN] \Checkstyle.java:39:33: '}' at column 33 should be alone on a line. [RightCurlyAlone]
Audit done.

 * All the indentation warnings are false positives
 *
 * Line 39 & 23 is example based on: https://github.com/checkstyle/checkstyle/pull/14901#discussion_r1639727320
 *
 * Line 23 is false negative, it should give warning. Pls refer to the git.diff file
 */
