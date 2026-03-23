package com.acme.basic;

public class HelloWorld {

  void sayHello() {
    System.out.println("Hello World!");
  }

  void notCovered() {
    System.out.println("This method is not covered by unit tests");
  }

  void test(Object obj) {
    if (obj != null && obj instanceof String) {
      System.out.println("string");
    }
  }

}
