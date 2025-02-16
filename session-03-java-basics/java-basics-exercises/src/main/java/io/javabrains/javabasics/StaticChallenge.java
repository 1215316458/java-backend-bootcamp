package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5];
        rectangles[0] = new Rectangle(3,4);
        rectangles[1] = new Rectangle(5,6);
        for(Rectangle rectangle : rectangles) {
            if(rectangle!=null){
                System.out.printf("area %d perimeter %d %n", rectangle.getArea(), rectangle.getPerimeter());
            }
        }
        System.out.println(Rectangle.getNumOfRectangles());
    }
}

class Rectangle {
    int width;
    int height;
    static int numOfRectangles = 0;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        ++numOfRectangles;
    }

    public static int getNumOfRectangles() {
        return numOfRectangles;
    }

    public int getArea() {
        return width*height;
    }
    public int getPerimeter() {
        return 2*(width + height);
    }
}