// Demonstrate the do-while loop.

class DoWhileDemo {
  public static void main(String args[])
    throws java.io.IOException {

    char ch;

    do {
      System.out.print("Press a key followed by ENTER: ");
      ch = (char) System.in.read(); // get a char
    } while(ch != 'q');
  }
}

