class Testing {
    public static void main(String[] args) {
        // create an integer
        int someNum = 101;

        // create an string array
        String[] stringAry = new String[10];

        // this wrapps the primitive in a wrapper to get the object of the primitive, then you can use the getClass() on it like you would a string ~ Ricca
        // System.out.println(((Object) someNum).getClass().getSimpleName());
        System.out.println("printing int: " + someNum + " <=> " + ((Object) someNum).getClass().getSimpleName());
        System.out.println("printing int toString: " + Integer.toString(someNum) + " <=> " + ((Object) Integer.toString(someNum)).getClass().getSimpleName());

        // turn the integer into a string to store in the string array
        stringAry[0] = Integer.toString(someNum);

        System.out.println("printing value from array: " + stringAry[0] + " <=> " + ((Object) stringAry[0]).getClass().getSimpleName());

        // turn the string value into an integer
        int backToAnInt = Integer.parseInt(stringAry[0]);
        if (backToAnInt == someNum) {
            System.out.println("values match");
        } else {
            System.out.println("values don't match");
        }

    }
}
