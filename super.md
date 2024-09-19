# `super` Keyword

In Java, the `super` keyword is used to refer to the immediate parent class of a child class. In other words, the `super` keyword is used by a subclass whenever it needs to refer to its immediate superclass.
1. Refer to the immediate parent class object.
2. Accessing Superclass Members:
3. Calling Superclass Constructors: `super()`
4. Using the super keyword we can access the Parent/Superclass function and variable.
5. Super Keyword we can use only in function but not in the constructor.
![image](https://github.com/user-attachments/assets/e78fafe9-2682-4dff-a625-dc85a1c10589)

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

# Example1- this keyword with super keyword
> When we use this keyword then it will print the instance variable.
```
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
    String anotherAddress="Instance variable of Child Class";
    // Method to display local and inherited variables
    public void displayAll() {
        System.out.println(" Parent Class: " + super.name);
        System.out.println(" Parent Class: " + super.address);
        System.out.println(" Child Class: " + this.anotherAddress);
    }
}
// Main class for program entry
public class SuperDemo {
    public static void main(String[] args) {
        // Create an instance of Child
        Child child = new Child();
        // Display information using the Child's method
        child.displayAll();
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/7070509b-eaf2-4c93-a986-e11b651d322f)

# Example2- this keyword with super keyword
```
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
    String name= "Child Name";
    String anotherAddress=" Child Address";
    // Method to display local and inherited variables
    public void displayAll() {
        System.out.println(" Parent Class: " + super.name);
        System.out.println(" Parent Class: " + super.address);
        System.out.println(" Parent Class: " + this.name);
        System.out.println(" Child Class: " + this.anotherAddress);
    }
}
// Main class for program entry
public class SuperDemo {
    public static void main(String[] args) {
        // Create an instance of Child
        Child child = new Child();
        // Display information using the Child's method
        child.displayAll();
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/9c72d3a8-33e4-44e1-ae78-5254e3a49f3d)
# Example3- Local variable with this keyword with super keyword
```
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
    String name= "Child Name";
    String anotherAddress=" Child Address";
    // Method to display local and inherited variables
    public void displayAll() {
        String name= "Local Variable of Child Name";
        String anotherAddress="Local Variable of Child Address";
        System.out.println(" Parent Class: " + super.name);
        System.out.println(" Parent Class: " + super.address);
        System.out.println(" Child Class: " + this.name);
        System.out.println(" Child Class: " + this.anotherAddress);
        System.out.println(" Child Class Local Variavle : " + name);
        System.out.println(" Child Class Local Variavle : " + anotherAddress);
    }
}
// Main class for program entry
public class SuperDemo {
    public static void main(String[] args) {
        // Create an instance of Child
        Child child = new Child();
        // Display information using the Child's method
        child.displayAll();
    }
}
```
![image](https://github.com/user-attachments/assets/0779c0e6-25e2-4bbf-b766-d9d9d1861810)

# `super()` method
![image](https://github.com/user-attachments/assets/051a10d3-496e-4dcd-a050-d00bba6f11db)
1. super() method always work for constructor and always call Parent class constructor.
2. Calling Superclass Constructors: `super()` and super() can be used inside constructor only.
![image](https://github.com/user-attachments/assets/fe269a98-69d5-4816-86df-cafeeace53a4)
# Example-1 super()
```
class Parent {
    //Constructor
    Parent(){
        super();
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Constructor");
    }
}
public class SuperMethod{
    public static void main(String[] args) {
        Child c= new Child();
    }
}
```
# Example-2 super()
![image](https://github.com/user-attachments/assets/6c918933-3b0c-4d95-8359-bf6204835538)
```
class GrandParent {
    //Constructor
    GrandParent(){
        super();
        System.out.println("GrandParent Constructor");
    }
}
class Parent extends GrandParent{
    //Constructor
    Parent(){
        super();
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Constructor");
    }
}
public class SuperMethod{
    public static void main(String[] args) {
        Child c= new Child();
    }
}
```
# Example-3 super()
![image](https://github.com/user-attachments/assets/190d20c5-d86f-4cbf-b2ca-9998190d566f)
```
class GrandParent {
    //Constructor
    GrandParent(){
        super();
        System.out.println("GrandParent Constructor");
    }
}
class Parent extends GrandParent{
    //Constructor
}
class Child extends Parent{
    Child(){
        super();//It calls grandparent constructor
        System.out.println("Child Constructor");
    }
}
public class SuperMethod1{
    public static void main(String[] args) {
        Child c= new Child();
    }
}

```
# Example-3 super() with double arguments
```
class Parent extends GrandParent{
    //Constructor
    Parent(int a, int b){
    System.out.println("Parent Constructor"+a+ " : "+b);
    }
}
class Child extends Parent{
    Child(int a, int b){
        super(10,20);
        System.out.println("Child Constructor");
    }
}
public class SuperMethod2{
    public static void main(String[] args) {
        Child c= new Child(10,20);
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/2c9cc408-2015-4296-b751-75461430d161)
# Example-3 super() with triple arguments
```
class  GrandParent{
    //Constructor
    GrandParent(){
    System.out.println("GrandParent No ARGS Constructor");
    }
    GrandParent(int a, int b){
        System.out.println("GrandParent Two ARGS Constructor"+a+ " : "+b);
        }
        GrandParent(int a, int b,int c){
            System.out.println("GrandParent Three ARGS Constructor"+ a + " : "+ b + " : "+ c);
            }
}
class Parent extends GrandParent{
    //Constructor
    Parent(int a, int b){
        super(23,24,25);
    System.out.println("Parent Double ARGS Constructor"+a+ " : "+b);
    }
}
class Child extends Parent{
    Child(int a, int b){
        super(10,20);
        System.out.println("Child Constructor");
    }
}
public class SuperMethod3{
    public static void main(String[] args) {
        Child c= new Child(10,20);
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/e575a7ad-6c12-44a5-9ba0-9b82f2a14169)
# Example-4 super keyword accessing Parent class variable and function
```
class Parent{
    String parentsName="Pankaj and Rekha";
    public void property(){
        System.out.println("Parent's Property with 1 Flast and 1 Kg Gold");
    }
    public void car(){
        System.out.println("Parent's Car");
    }
} 
class child extends Parent{
    public void property(){
        System.out.println("Parent's Property with 1 Flat and 2 Kg Gold");
    }
    public void car(){
        System.out.println("Child Car With Airbags");
    }
    public void accessParentsOldCar(){
         super.car();
    }
    public void accessParentsOldProperty(){
        super.property();
   }
   public String getParentsName(){
    return super.parentsName;
}
}
public class SuperMethod4{
    public static void main(String[] args) {
        child c =new child();
        c.car();
        c.accessParentsOldCar();
        c.property();
        c.accessParentsOldProperty();
        System.out.println(c.parentsName);
        
    }
}

```
![image](https://github.com/user-attachments/assets/45fdae72-739d-4357-8880-207f3486dec9)
# Example-4 super keyword accessing Parent class variable and function
```
// Parent class
 class Parent {
    String name;
    String address;

    public Parent(String name, String address) {
        System.out.println("parent constructor");
        this.name = name;
        this.address = address;
    }

    public void show() {
        System.out.println(name);
        System.out.println(address);
        System.out.println("==========");
    }
}

// Child class extending Parent
class Child extends Parent {

    String name;
    String anotherAddress;

    public Child(String name, String anotherAddress, String parentName, String parentAddress) {
        // parent class constructor
        // super() call must be the first line of child class constructor
        super(parentName, parentAddress);
        System.out.println("child classs constructor called");
        this.name = name;
        this.anotherAddress = anotherAddress;

    }

    public void displayAll() {
        // String anotherAddress = "test";
        String name = "local name";

        System.out.println(name);
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(super.address);
        System.out.println(this.anotherAddress);

        super.show();

    }

}

// Main class for program entry
public class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child(
                "John ",
                "America",
                "mohanlal",
                "ranipur"

        );
        child.displayAll();
    }
}

```
# Output
![image](https://github.com/user-attachments/assets/2084ca85-9b2c-4ce5-aaee-8569211a670c)
