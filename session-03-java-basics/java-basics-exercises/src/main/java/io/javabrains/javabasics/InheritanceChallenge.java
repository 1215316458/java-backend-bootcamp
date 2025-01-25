package io.javabrains.javabasics;

/*

1.  Create an `Animal` class with member variables for the name and age of the animal and a constructor method that initializes the member variables.
2.  Create a `Dog` class that extends the `Animal` class and has a member variable for the breed of the dog and a constructor method that initializes the member variables.
3.  Override the `makeSound` method in the `Dog` class to print "The dog barks".
4.  Create a `Cat` class that extends the `Animal` class and has a member variable for the number of lives of the cat and a constructor method that initializes the member variables.
5.  Override the `makeSound` method in the `Cat` class to print "The cat meows".
6.  In the `main` method of this class, create an array of `Animal` objects and initialize it with a `Lion`, a `Dog`, a `Cat`, and another `Animal` of your choice.
7.  Loop through the array of `Animal` objects and print the name, age, and sound of each animal.
 */


public class InheritanceChallenge {

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Snoopy", 3, "GreatDen");
        animals[1] = new Cat("Pilli", 5,6);
        for(Animal animal : animals) {
            System.out.println(animal.toString());
            animal.makeSound();
        }

    }
}

abstract class Animal {
    String name;
    int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Dog extends Animal {
    String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {
    int lives;
    public Cat(String name, int age, int lives) {
        super(name, age);
        this.lives = lives;
    }

    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}