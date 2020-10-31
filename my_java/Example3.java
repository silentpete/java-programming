/*
  This program illustrates the differences
  between in and double.

  Call this file Example3.java
*/

class Example3 {
  public static void main(String args[]) {
    int var; // this declares an int variable
    double x; // this declares a floating-point variable

    var = 10; // assign var the value 10

    x = 10.0; // assign x the value 10.0

    System.out.println("Original value of var as an 'int': " + var);
    System.out.println("Original value of x as an 'double': " + x);
    System.out.println(); // print a blank line

    // now, divide both by 4
    var = var / 4;
    x = x / 4;

    System.out.println("var after dividing by 4: " + var);
    System.out.println("x after dividing by 4: " + x);
  }
}
