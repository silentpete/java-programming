// Use varargs with standard arguments.
class VarArgs2 {
    
    // Here, msg is a normal parameter and v is a
    // varargs parameter.
    static void vaTest(String msg, int ... v) {
        System.out.println(msg + v.length);
        System.out.println("Contents :");
        
        for(int i = 0; i < v.length; i++)
            System.out.println("  arg " + i + ": " + v[i]);
        
        System.out.println();
    }
    
    public static void main(String args[]) {
        
        vaTest("One varargs: ", 10);          // 1 arg
        vaTest("Three varargs: ", 1, 2, 3 );  // 3 args
        vaTest("No varargs: ");               // no args
    }
}