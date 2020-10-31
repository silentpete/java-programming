/*
  character variables can be handles like integers.
*/

class CharArithDemo {
  public static void main(String args[]) {
    char ch;

    ch = 'X';
    System.out.println("ch contains " + ch);

    ch++; // increment ch
    System.out.println("ch now contains " + ch);

    ch = 90; // give ch the value of unicode 90, should be Z
    System.out.println("ch now contains " + ch);
  }
}
