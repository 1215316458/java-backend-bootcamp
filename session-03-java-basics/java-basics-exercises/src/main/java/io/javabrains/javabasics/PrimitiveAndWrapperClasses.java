package io.javabrains.javabasics;

public class PrimitiveAndWrapperClasses {
    public static void main(String[] args) {
        // Step 1: Declare primitive variables
        int i = 10;
        long l = 4L;
        float f = 3.4f;
        double d = 5.6;
        char c ='q';
        boolean b= true;
       // Step 2: Convert primitive variables to wrapper objects
        Integer integer = i;
        Long longN = l;
        Float floatN = f;
        Double doubleN = d;
        Character character = c;
        Boolean booleanN = b;

        // Step 3: Print the values of the wrapper objects
        System.out.printf("Integer %d Long %d Float %f Double %f Character %c Boolean %b%n",integer,longN,floatN,doubleN,character, booleanN);

        // Step 4: Convert wrapper objects back to primitive variables
        int iPrimitive = integer;
        long lPrimitive = longN;
        float fPrimitive = floatN;
        double dPrimitive = doubleN;
        char cPrimitive = character;
        boolean bPrimitive = booleanN;

        // Step 5: Print the values of the primitive variables
        System.out.printf("int %d long %d float %f double %f char %c boolean %b%n", iPrimitive, lPrimitive, fPrimitive, dPrimitive, cPrimitive, bPrimitive);

    }
}
