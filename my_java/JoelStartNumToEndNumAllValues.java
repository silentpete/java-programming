/*
 * Ask for a starting number
 * Ask for a ending number
 * Ask for an incrementor
 *
 * Print all values from
 * starting number to ending number
 */



class JoelStartNumToEndNumAllValues {
  public static void main(String args[])
    throws java.io.IOException {

    int startNum = 1;
    int endNum = 20;
    int incrementNum = 2;

/*    System.out.println("Please give me a number to start with: ");
    startNum = (int) System.in.read();

    System.out.println("Please give me a number to end with: ");
    endNum = (int) System.in.read();

    System.out.println("Please give me a number to increment by: ");
    incrementNum = (int) System.in.read();
*/
    System.out.println("\n");

    for(; startNum < endNum; startNum = startNum + incrementNum) {
    System.out.println(startNum);
    }
  }
}
