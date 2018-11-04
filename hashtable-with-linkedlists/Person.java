public class Person {
    // fields
    int id;
    String firstName;
    String lastName;

    // constructors
    public Person(int i, String fn, String ln) {
        this.id = i;
        this.firstName = fn;
        this.lastName = ln;
    }

    // methods
    public int getID() {
        return id;
    }

    public String getFN() {
        return firstName;
    }

    public String getLN() {
        return lastName;
    }
}
