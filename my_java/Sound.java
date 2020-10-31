/*
  Try this 2-1

  Compute the distance to a lightning 
  strike whose sound takes 7.2 seconds
  to reach you.

  Sound travels at approx. 1,100 fps
*/

class Sound {
  public static void main(String args[]) {
    double dist;
    dist = 1100 * 7.2;

    System.out.println("The lightning is " + dist + " feet away.");
  }
}
