# Inheritance (IS-A Relationship)

1. It's a mechanism where a new class acquires the properties and behaviors of an existing class.
2. Class which provides the properties and behaviors is called Parent Class / Super Class / Base Class.
3. New class which takes the properties and behaviors is called Child Class / Sub Class / Derived Class.
4. **Code Reusability**: Subclass reuses code from the superclass, avoiding duplication.
5. **Extension**: Subclass can add new properties and methods to extend functionality.
6. `extends` keyword is used to do inheritance.

# Types of Inheritance

1. **Single Inheritance**: A subclass inherits from only one superclass.
2. **Multilevel Inheritance**: A subclass inherits from a superclass, which itself inherits from another superclass.
3. **Hierarchical Inheritance**: Multiple subclasses inherit from a single superclass.
4. **Multiple Inheritance**: A subclass inherits from multiple superclasses (not directly supported in Java, but achieved through interfaces).
5. **Hybrid Inheritance**: Involving more than one inheritance.
6. **Cyclic Inheritance**: When a cycle is formed in the hierarchy.

Inheritance is a powerful tool for building well-structured, reusable, and extensible Java applications.
# Example-1
```
class Parent{
        //Parent's property
        public void Home(){
            System.out.println("Parent's Home");
        }
}
class Child extends Parent{
    //Parent's property
    //Child mobile
    public void mobile(){
        System.out.println("Child's Mobile");
    }
}
public class Main{
    public static void main(String[] args) {
        Child c= new Child();
        c.Home();
        c.mobile();
////Not Accessible because of Parent Class is unable to access child's method
        Parent p = new Parent();
        p.mobile();
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/3cd8e5c3-3dd5-4713-bdb4-135aec8d2101)
