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
# Output
![image](https://github.com/user-attachments/assets/54e4e59f-c32c-4767-b467-ef683bab8ec9)
# Example-3 Calling Current Class Constructor
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
         System.out.println("Object Created");
         pepsi1.display();
         Pepsi pepsi2 = new Pepsi(90.23, "MakeItDrink");
         pepsi2.display();
     }
}
```
# Output
![image](https://github.com/user-attachments/assets/05e0a04e-dcb8-4319-a2de-b56353c264ad)
# Example- Referring to Current Object
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
        System.out.println("display()"+this);
      }
     public static void main(String[] args) {
         Pepsi pepsi1 = new Pepsi();
         System.out.println("Object Created");
         pepsi1.display();
         System.out.println(pepsi1);
         Pepsi pepsi2 = new Pepsi(90.23, "MakeItDrink");
         pepsi2.display();
         System.out.println(pepsi2);
     }
}
```
# Output
![image](https://github.com/user-attachments/assets/5e60119d-2338-418e-92f5-0ad2b65ec706)
# Example-Passing Current Object
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
        System.out.println("display()"+this);
        Drinker drinker = new Drinker();
        drinker.drink(this);
      }
    public class Drinker {
    public void drink(Pepsi p) {
        System.out.println("drinker is drinking " + p);

    }
}
     public static void main(String[] args) {
         Pepsi pepsi1 = new Pepsi();
         System.out.println("Object Created");
         pepsi1.display();
         System.out.println(pepsi1);
         Pepsi pepsi2 = new Pepsi(90.23, "MakeItDrink");
         pepsi2.display();
         System.out.println(pepsi2);
     }
}
```
# Output
![image](https://github.com/user-attachments/assets/da5c27e2-26ba-4de2-8470-b4bfc7fd7e49)
# Example- Method Chaining
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
    
    public Pepsi display() {
        System.out.println("Price : " + price);
        System.out.println("Brand : " + this.brand);
        System.out.println("display() " + this);
        Drinker drinker = new Drinker();
        drinker.drink(this);
        return this;

    }
public class Drinker {
    public void drink(Pepsi p) {
        System.out.println("drinker is drinking " + p);

    }
}
    
public Pepsi m1() {
        System.out.println("m1() method");
        return this;

    }

    public Pepsi m2() {
        System.out.println("m2() method ");
        return this;
    }

    public Pepsi m3() {
        System.out.println("m3() method ");
        return this;
    }

    public Pepsi m4() {
        System.out.println("m4() method");
        return this;
    }
     public static void main(String[] args) {
         // method chaining--> this keywords
        Pepsi pepsi1 = new Pepsi();
        pepsi1.m1().m2().m3().m4().display();
     }
}
```
# Output
![image](https://github.com/user-attachments/assets/99916214-7884-4354-8690-116253b35baf)
