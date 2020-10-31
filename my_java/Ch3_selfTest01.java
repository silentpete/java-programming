/*
 * Write a program that reads characters from the keyboard until
 * a period is received. Have the program count the number of
 * characters. Report the total at the end of the program.
 */

class Ch3_selfTest01 {
  public static void main(String args[])
    throws java.io.IOException {

    int counter = 0;
    char userChoice, ignore;

    for( ; ; ) {
      do {
        System.out.println("Please type (end with .): ");
        userChoice = (char) System.in.read();

        do {
          ignore = (char) System.in.read();
          ++counter;
        } while(ignore != '.');
      } while(userChoice != '.');
      if(userChoice == '.') break;
      System.out.println("\n");
    }
    System.out.println("number of characters entered: " + counter);
  }
}

