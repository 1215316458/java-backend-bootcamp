package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int[] integers = new int[5];
        for(int i=0;i<integers.length;i++){
            integers[i] = i*i;
        }
        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        System.out.println("Sum of integers are "+ Arrays.stream(integers).sum());
        System.out.println("average of integers = " + Arrays.stream(integers).average());
        System.out.println("largest numbers of integers = " + Arrays.stream(integers).max().orElse(Integer.MAX_VALUE));

    }
}
