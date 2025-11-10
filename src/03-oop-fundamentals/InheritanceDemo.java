/**
 * InheritanceDemo - Inheritance Example
 * 
 * This program demonstrates:
 * - Parent class (superclass)
 * - Child class (subclass)
 * - Method overriding
 * - super keyword
 * - IS-A relationship
 * 
 * @author BICT Java Foundation Course
 * @version 1.0
 */

// Parent class (Superclass)
class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    // Method overriding
    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }
    
    // Additional method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call parent method
        System.out.println("Breed: " + breed);
    }
}

// Another child class
class Cat extends Animal {
    private String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }
    
    public void scratch() {
        System.out.println(name + " is scratching the furniture!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== Inheritance Demo ===\n");
        
        // Creating parent class object
        System.out.println("1. Parent Class Object:");
        Animal animal = new Animal("Generic Animal", 5);
        animal.displayInfo();
        animal.eat();
        animal.sleep();
        animal.makeSound();
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        // Creating Dog object
        System.out.println("2. Dog (Child Class) Object:");
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        dog.eat();           // Inherited method
        dog.sleep();         // Inherited method
        dog.makeSound();     // Overridden method
        dog.fetch();         // Dog-specific method
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        // Creating Cat object
        System.out.println("3. Cat (Child Class) Object:");
        Cat cat = new Cat("Whiskers", 2, "Orange");
        cat.displayInfo();
        cat.eat();           // Inherited method
        cat.sleep();         // Inherited method
        cat.makeSound();     // Overridden method
        cat.scratch();       // Cat-specific method
        
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        // Polymorphism demonstration
        System.out.println("4. Polymorphism (Parent reference to child object):");
        Animal myPet1 = new Dog("Max", 4, "Labrador");
        Animal myPet2 = new Cat("Luna", 1, "White");
        
        System.out.println("\nCalling makeSound() on Animal reference:");
        myPet1.makeSound();  // Calls Dog's makeSound()
        myPet2.makeSound();  // Calls Cat's makeSound()
        
        // Note: Can't call Dog/Cat specific methods through Animal reference
        // myPet1.fetch();   // This would cause compile error
        // myPet2.scratch(); // This would cause compile error
        
        System.out.println("\nInheritance Benefits:");
        System.out.println("✓ Code reusability");
        System.out.println("✓ Method overriding");
        System.out.println("✓ Polymorphism");
        System.out.println("✓ IS-A relationship (Dog IS-A Animal)");
    }
}
