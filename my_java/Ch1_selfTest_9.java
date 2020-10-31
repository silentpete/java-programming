/*
  Chapeter 1 Self Test Question 9

  The moon's gravity is about 17 percent that of earth's. Write a program
  that computes your effective weight on the moon.

*/

class Ch1_selfTest_9 {
  public static void main(String args[]) {
    int body_weight = 168;
    double moon_weight; // assign moon_weight a double as it'll have remainders

    moon_weight = body_weight * .17; // calculate body weight on the moon

    System.out.println("peter weights " + moon_weight + "lbs on the moon.");
  }
}
