# Inheritance (IS-A Relationship)

1. It's a mechanism where a new class acquires the properties and behaviors of an existing class.
2. Class which provides the properties and behaviors is called Parent Class / Super Class / Base Class.
3. New class which takes the properties and behaviors is called Child Class / Sub Class / Derived Class.
4. **Code Reusability**: Subclass reuses code from the superclass, avoiding duplication.
5. **Extension**: Subclass can add new properties and methods to extend functionality.
6. `extends` keyword is used to do inheritance.

# Types of Inheritance

1. **Single Inheritance**: A subclass inherits from only one superclass.
2. **Multilevel Inheritance**: A subclass inherits from a superclass, which itself inherits from another superclass.When more than two subclasses are inherited from one super class then Multi Level inheritence
                 Achieved.
4. **Hierarchical Inheritance**: Multiple subclasses inherit from a single superclass.
5. **Multiple Inheritance**: A subclass inherits from multiple superclasses (not directly supported in Java, but achieved through interfaces).
6. **Hybrid Inheritance**: Involving more than one inheritance.
7. **Cyclic Inheritance**: When a cycle is formed in the hierarchy.

Inheritance is a powerful tool for building well-structured, reusable, and extensible Java applications.

![image](https://github.com/user-attachments/assets/24b24005-c1fd-4ecc-94f2-e1ade43a73e3)

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
        //Parent p = new Parent();
        //p.mobile();
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/3cd8e5c3-3dd5-4713-bdb4-135aec8d2101)
# Single Level Inheritance
```
class Parent {
    String homeName = "Home Sweet Home";
    double property = 100000;
    public void parentProperty(){
        System.out.println("Parent property is:"+ property);
    }
}
class Child extends Parent{
    String childName = "Bunty";
    String schoolName = "XYZ Public School";
    public void schoolName(){
        System.out.println("Child school name is :" + schoolName);
    }
}
public class Main2{
    public static void main(String[] args){
    ////Printing Parent Data
    Parent p = new Parent();
    p.parentProperty();
    //p.schoolName();// with parent reference we can't call child data
    //System.out.println(p.childName); //with parent reference we can't call child data
    System.out.println();
    
    ////Printing Child Data

    Child c = new Child();
    System.out.println(c.childName);
    c.schoolName();
    c.parentProperty();
    System.out.println(c.homeName);

    System.out.println();
    
    Parent p1 = new Child();////Reference of Parent and object of child is possible
    System.out.println(c.homeName);
    p1.parentProperty();

    //Child c1 = new Parent();////Reference of Child and object of Parent is impossible
    }
}
```
# Multi-Level Inheritance
![image](https://github.com/user-attachments/assets/17441017-c817-40fd-bc33-67b54c4900c1)

