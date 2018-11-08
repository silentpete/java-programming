/**
 * TestFibonacci
 * Ref: https://stackoverflow.com/questions/8965006/java-recursive-fibonacci-sequence
 */
class TestFibonacci {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(6));
    }
}

class Fibonacci {
    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
