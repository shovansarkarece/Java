# Understanding the `this` Keyword in Java

1. **Resolving Naming Conflict**:
    - The `this` keyword is used to remove the naming conflict between local and instance variables of the same name.

2. **Calling Current Class Methods and Variables**:
    - The `this` keyword is used to call the current class's methods and variables.

3. **Calling Current Class Constructor**:
    - The `this()` is used to call the current class constructor from inside another constructor.

4. **Referring to Current Object**:
    - The `this` keyword refers to the current invoking object.

5. **Passing Current Object**:
    - The `this` keyword is used when passing the current object as an argument to another method.

6. **Method Chaining**:
    - The `this` keyword enables method chaining by returning the current object.

7. **Handling Local and Instance Variable Name Conflicts**:
    - When a local variable and an instance variable have the same name, preference is given to the local variable. However, if the `this` keyword is used, the instance variable of the current object/class will be accessed.
# Example-**Handling Local and Instance Variable Name Conflicts**:
> When a local variable and an instance variable have the same name, preference is given to the local variable. However, if the `this` keyword is used, the instance variable of the current object/class will be accessed.
```
public class Pepsi {
    // instance variable
    double price = 30;
    String brand = "B1";
    public Pepsi() {
        double price = 15;
         System.out.println("Price of Pepsi is " + price);
         System.out.println("Price of Pepsi is " + this.price);
         System.out.println("Brand " + this.brand);
    }
    public static void main(String[] args) {
        new Pepsi();
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/2eaa3cd0-d547-46dc-8de8-d93c45ee3ced)
# Example-Calling Current Class Methods and Variables
> The `this` keyword is used to call the current class's methods and variables.
```
public class Pepsi {
    // instance variable
    double price = 30;
    String brand = "B1";
    public Pepsi() {
        double price = 15;
         System.out.println("Price of Pepsi is " + price);
         System.out.println("Price of Pepsi is " + this.price);
         System.out.println("Brand " + this.brand);
         this.display();
         display();
    }
    public void display() {
        System.out.println("display method()");
    }
    public static void main(String[] args) {
        new Pepsi();
    }
}
```
# Example-Calling Current Class Constructor
> The this() is used to call the current class constructor from inside another constructor.
```
public class Pepsi {
    // instance variable
    double price = 30;
    String brand = "B1";
    public Pepsi() {
        // constructor calling--it must be the first line
        this(30.98, "Cocacola");// WE are calling constructor which have two parameter

        System.out.println("Zero Arg constructor");
        System.out.println("Creating object");
        System.out.println("Wow its amazing wor");
    }
    public Pepsi(double price, String brand) {
        System.out.println("Two arg constructor");
        this.price = price;
        this.brand = brand;
    }
     public static void main(String[] args) {
         new Pepsi();
     }
}
```
# Output
![image](https://github.com/user-attachments/assets/a458bcdc-d279-4b18-8de9-3242c597705a)
# Example-2 Calling Current Class Constructor
```
public class Pepsi {
    // instance variable
    double price = 30;
    String brand = "B1";
    public Pepsi() {
        // constructor calling--it must be the first line
        this(30.98, "Cocacola");

        System.out.println("Zero Arg constructor");
        System.out.println("Creating object");
        System.out.println("Wow its amazing wor");
    }
    public Pepsi(double price, String brand) {
        System.out.println("Two arg constructor");
        this.price = price;
        this.brand = brand;
    }
      public void display() {
        System.out.println("Price : " + price);
        System.out.println("Brand : " + this.brand);
      }
     public static void main(String[] args) {
         Pepsi pepsi1 = new Pepsi();
         pepsi1.display();
     }
}
```
![image](https://github.com/user-attachments/assets/54e4e59f-c32c-4767-b467-ef683bab8ec9)
