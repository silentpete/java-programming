public class InsertionNumSortTesting {
  public static void main(String[] args) {
    System.out.println("Testing an Insertion Number Sort");

    int[] a = {1,3,2,8,-1,6,9};

    InsertionNumSort ins = new InsertionNumSort();

    ins.printMyAry(a);

    System.out.println("sort array");
    // ins.theBookSort(a);
    ins.insertionSort(a);

    ins.printMyAry(a);

  }
}

class InsertionNumSort {
  // code in book: Schaum's Outline of Data Structures with Java, Second Edition, chapter 14
  public void theBookSort(int[] a) {
    for (int i = 1; i < a.length; i++) {
      int ai = a[i], j; // this line needs research and notes
      for (j = i; j > 0 && a[j-1] > ai; j--) {
        a[j] = a[j-1];
      }
      a[j] = ai;
    }
  }

  // code from: https://www.javatpoint.com/insertion-sort-in-java with my replacing variable names
  // pass in an array of int values
  public void insertionSort(int intAry[]) {
    // get length of array
    int aryLength = intAry.length;
    // create loop to loop array length, start first value +1. Will use this to get index 1 instead of index 0
    for (int j = 1; j < aryLength; j++) {
      // save the value starting at index 1
      int aryVal = intAry[j];
      // create a value from the outside loop iterator less 1. Will use this to help know when to exit the second loop
      int i = j-1;
      // while value from outside loop is not less than 0 and the value left of the array value is less, swap the values
      while ( (i > -1) && ( intAry[i] > aryVal ) ) {
        // move right value left
        intAry[i+1] = intAry[i];
        // minus the iterator,
        i--;
      }
      // either put back the value if nothing changed, or second half of swapping the value
      intAry[i+1] = aryVal;
    }
  }

  public void printMyAry(int[] a) {
    System.out.println("Array Contents");
    for (int i = 0; i < a.length; i++) {
      if ((i+1) == a.length) {
        System.out.println(a[i]);
      } else {
        System.out.print(a[i] + ",");
      }
    }
  }
}
