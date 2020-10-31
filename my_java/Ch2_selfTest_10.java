// write a program that finds all the prime numbers between 2 and 100

class Ch2_selfTest_10 {
  public static void main(String args[]) {
    int numsToTest = 100;

    for(int numerator = 2; numerator <= numsToTest; numerator++) {
      boolean isNumeratorPrime = true;
      for(int denomonator = 0; denomonator <= numsToTest; denomonator++) {
        if(denomonator != 0) {
          if(denomonator != 1) {
            if(denomonator < numerator) {
              if(numerator % denomonator == 0) {
                isNumeratorPrime = false;
              }
            }
          }
        }
      }
      if(isNumeratorPrime == true) {
        System.out.println(numerator);
      }
    }
  }
}
