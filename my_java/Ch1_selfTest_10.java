/*
  Chapter 1 Self Test Question 10

  Adapt Try This 1-2 so that it prints a conversion table of inches to meters.
  Display 12 feet of conversions, inch by inch. 
  Output a blank line every 12 inches.
  (one meter equals approximately 39.37 inches)

*/

class Ch1_selfTest_10 {
  public static void main(String args[]) {
    int inch, counter;
    double meter = 39.37;
    int foot = 12;
    int feet = 12;
    int total_length = foot * feet;
    int num_of_meters = 0;

    counter = 0;
    for(inch = 1; inch <= total_length; inch++) {
      System.out.println(inch + " inch");
      counter++;

      if(counter >= meter) {
	num_of_meters++;
        System.out.println(num_of_meters + " meter");
        counter = 0; //reset the counter
      }
    }
  }
}
