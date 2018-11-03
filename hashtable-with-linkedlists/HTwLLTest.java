import java.util.*;
/**
 * HTwLLTest
 * For class CS230
 * Need to have a hashtable of LL's.
 * Store ID=person in modulo buckets
 */
public class HTwLLTest {

    public static void main(String[] args) {
        System.out.println("Hello");

        // Create some people
        Person p1 = new Person(5, "peter", "gallerani");
        Person p2 = new Person(2, "nicole", "smith");
        Person p3 = new Person(10, "john", "doe");

        // create a hashtable
        Hashtable ht = new Hashtable();

        // hashtable will have 5 buckets
        int buckets = 5;
        for (int i = 0; i < buckets; i++) {
            // create a linked list and put it in each bucket
            LinkedList ll = new LinkedList();
            ht.put(i, ll);
        }

        int mod;
        LinkedList tmpll;
        // get the modulo from the person id
        mod = p1.getID() % buckets;
        // get the linked list from the modulo
        tmpll = (LinkedList) ht.get(mod);
        // add the person to the bucket
        tmpll.addLast(p1);

        mod = p2.getID() % buckets;
        tmpll = (LinkedList) ht.get(mod);
        tmpll.addLast(p2);

        mod = p3.getID() % buckets;
        tmpll = (LinkedList) ht.get(mod);
        tmpll.addLast(p3);

        System.out.println(ht.size());
        System.out.println("hashtables key 0 = " + ht.get(0));
        System.out.println("hashtables key 1 = " + ht.get(1));
        System.out.println("hashtables key 2 = " + ht.get(2));
        System.out.println("hashtables key 3 = " + ht.get(3));
        System.out.println("hashtables key 4 = " + ht.get(4));

        for (int i = 0; i < buckets; i++) {
            System.out.println("Bucket " + i);
            tmpll = (LinkedList) ht.get(i);
            for (int j = 0; j < tmpll.size(); j++) {
                Person p = (Person) tmpll.get(j);
                System.out.println(p.firstName + " " + p.lastName + " is ID: " + p.getID());
            }
        }
    }
}
