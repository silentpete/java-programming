// Objects are passed through their references.

class Test {
    int a, b;
    
    Test(int i, int j) {
        a = i;
        b = j;
    }
    /*
     * Pass an object. now, ob.a and ob.b in object
     * used in the call will be changed.
     */
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}

class PassObRef {
    public static void main(String args[]) {
        Test ob = new Test(15, 20);
        
        System.out.println("ob.a and ob.b before call: " +
                           ob.a + " " + ob.b);
        
        ob.change(ob);
        
        System.out.println("ob.a and ob.b after call: " + 
                           ob.a + " " + ob.b);
    }
}