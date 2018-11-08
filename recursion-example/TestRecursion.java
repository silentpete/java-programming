/**
 * TestRecursion
 */
public class TestRecursion {

    public static void main(String[] args) {
        Recursion r = new Recursion();
        r.minusOne(5);
    }
}

/**
 * Recursion
 * Ref: http://www.danzig.us/java_class/recursion.html
 */
class Recursion {

    public void minusOne(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println("" + n);
            minusOne(--n);
            return;
        }
    }

}
