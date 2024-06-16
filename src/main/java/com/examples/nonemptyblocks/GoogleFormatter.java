package com.examples.nonemptyblocks;

/** testing. */
public class GoogleFormatter {
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
      case 2:
        {
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

  public int getX() {
    return 0;
  }
}
