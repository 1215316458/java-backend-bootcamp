package io.javabrains.javabasics;

public class InstanceOf {

    public static void main(String[] args) {

        Object[] objects = {
                10,
                "Hello",
                true,
                20.5
        };

        // Challenge: Use instanceof to determine the type of each object in the array
        for(Object object : objects) {
            switch (object) {
                case Integer i -> System.out.println(i + " is an Integer");
                case String s -> System.out.println(s + " is a String");
                case Boolean b -> System.out.println(b + " is a Boolean");
                case Double d -> System.out.println(d + " is a Double");
                default -> System.out.println(object + " is of unknown type");
            }
            if(object instanceof Integer) {
                System.out.println(object + " is an Integer");
            }
        }

    }
}
