# `super` Keyword

In Java, the `super` keyword is used to refer to the immediate parent class of a child class. In other words, the `super` keyword is used by a subclass whenever it needs to refer to its immediate superclass.
1. Refer to the immediate parent class object.
2. Accessing Superclass Members:
3. Calling Superclass Constructors: `super()`

## Points to Remember

1. Use `this` to refer to the current object's members.
2. Use `super` to refer to the superclass's members.
3. `super` must be the first statement in a subclass constructor if you're calling a superclass constructor.
4. `super` cannot be used in static methods or blocks, as they don't belong to specific objects.
```
# Example- Super Keyword
// Parent class
 class Parent {
    String name="Parent Name";
    String address="Parent Address";
    // Show method to display name and address
    public void show() {
        System.out.println("Parent's Name: " + name);
        System.out.println("Parent's Address: " + address);
        System.out.println("==========");
    }}
// Child class extending Parent
 class Child extends Parent {
    String anotherAddress;
    // Method to display local and inherited variables
    public void displayAll() {
        System.out.println(" Parent Class: " + super.name);//Accessing Parent class using super keyword
        System.out.println(" Parent Class: " + super.address);
    }}
// Main class for program entry
public class SuperDemo {
    public static void main(String[] args) {
        // Create an instance of Child
        Child child = new Child();
        // Display information using the Child's method
        child.displayAll();
    }}
```
# Output
![image](https://github.com/user-attachments/assets/94b5fbb5-21bd-4e4f-83a4-181ac06816c0)

# Example- this keyword with super keyword
> When we use this keyword then it will print the instance variable.

# Output
![image](https://github.com/user-attachments/assets/09cf6fa6-620e-43ad-ae9c-07beeec53f1e)

