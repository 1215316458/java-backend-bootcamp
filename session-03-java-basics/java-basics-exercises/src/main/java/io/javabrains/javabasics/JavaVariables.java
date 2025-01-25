package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        // int variable to store an integer value
        int i = 10;

        // long variable to store a long value
        long l = 4L;

        // float variable to store a floating-point value
        float f = 3.4f;

        // double variable to store a double value
        double d = 5.6;
        // char variable to store a single character
        char c ='q';


        // boolean variable to store a boolean value
        boolean b= true;


        // String variable to store a string of characters
        String s = "dileep";
        
        

        // Step 2: Print the values of the variables to the console
        printVariables(i, l, d, f, c, b, s);

        // Step 3: Modify the values of the variables and print the updated values
        i=122;
        l=1444;
        d=4846;
        f=544154115;
        c='5';
        b=false;
        s="brinda";

        System.out.println("post modifying variables");
        printVariables(i, l, d, f, c, b, s);

    }

    private static void printVariables(int i, long l, double d, float f, char c, boolean b, String s) {
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("c = " + c);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
    }
}
