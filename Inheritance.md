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
> Parent reference is capable to hold  child’s object  but child’s reference  is incapable to hold  Parent’s object
```
class GrandParent{
    int gold = 100;
    public void grandParentProperty(){
        System.out.println();
    }
}
class Parent extends GrandParent{
    public void parentProperty(){
        System.out.println("Parent have 3 BHK Flat");
    }
}
class Child1 extends Parent{
    public void child1Property(){
        System.out.println("Child 1 has R15 Bike");
    }
}
class Child2 extends Child1{
    public void child2Property(){
        System.out.println("Child 2 has Toy Bike");
    }
}
public class Main3{
    public static void main(String[] args) {
        GrandParent g = new GrandParent();
        g.grandParentProperty();

        System.out.println("Parent Object Creation and accessing method");

        Parent p = new Parent();
        p.grandParentProperty();
        p.parentProperty();

        System.out.println("Child1's Object Creation and accessing method");

        Child1 c1 = new Child1();
        c1.grandParentProperty();
        c1.parentProperty();
        c1.child1Property();

        System.out.println("Child2's Object Creation and accessing method");
          
        Child2 c2 = new Child2();
        c2.grandParentProperty();
        c2.parentProperty();
        c2.child1Property();
        c2.child2Property();

    }
}
```
# Hierarchical Inheritance
> Parent's Reference= Parent's Object Creation
> >  Parent's Reference= Child's Object Creation
> > > Child's Reference= Child's Object Creation 
> > > > Child's Reference= Parent's Object Creation (Impossible)

![image](https://github.com/user-attachments/assets/1495aa5d-ea62-4dbf-8571-e6818024220b)
![image](https://github.com/user-attachments/assets/73c67d9c-5a48-4581-9002-64fd0c4cfa62)
```
class Parent {
    public void parentProperty(){
        System.out.println("Parent have 3 BHK Flat and 1KG Gold");
    }
}
class Child1 extends Parent{
    public void child1Property(){
        System.out.println("Royal Enfield Bike");
    }
}
class Child2 extends Parent{
    public void child2Property(){
        System.out.println("KTM Bike");
    }
}
class Child3 extends Parent{
    public void child2Property(){
        System.out.println("R15 Bike");
    }
}
public class Main4{
    public static void main(String[] args) {

        System.out.println("Parent Object Creation and accessing method");

        Parent p = new Parent();
        p.parentProperty();

        System.out.println("Child1's Object Creation and accessing method");

        Child1 c1 = new Child1();
        c1.parentProperty();
        c1.child1Property();

        System.out.println("Child2's Object Creation and accessing method");
          
        Child2 c2 = new Child2();
        c2.parentProperty();
        c2.child2Property();

        System.out.println("Child3's Object Creation and accessing method");
          
        Child3 c3 = new Child3();
        c3.parentProperty();
        c3.child2Property();

    }
}
```
# Output
![image](https://github.com/user-attachments/assets/49fe35c4-8d13-44de-839e-b8b25f601088)
