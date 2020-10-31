// The Body of a loop can be empty

class EmptyFor3 {
  public static void main(String args[]) {
    int i;
    int sum = 0;

    // Sum the numbers through 5
    for(i = 1; i <= 5; sum += i++) ;

    System.out.println("Sum is " + sum);
  }
}

