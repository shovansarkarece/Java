# Overriding

If we want to achieve runtime polymorphism, we have to use **method overriding**.

Method overriding means declaring two methods with the same method signature in two different classes that have an **IS-A relationship** (inheritance).

## Rules for Method Overriding

While method overriding and writing the method signature, we must follow these rules:

- **Method name** must be the same.
- **List of parameters** must be the same.
- **Return type** must be the same.
- **Private, final,** and **static** methods cannot be overridden.
- There must be an **IS-A relationship** between the classes (inheritance).
- The overriding method must have the same signature (name, return type, and
parameter list) as the superclass method.
- The overriding method can have a broader access modifier (e.g., public overriding
protected).
- While overriding we can not decrease the visibility of the method.(public>protected>default>private)
- While overriding the method resolution for JVM is based on the creation of the runtime object
- Constructors cannot be overridden.

![image](https://github.com/user-attachments/assets/cad342f9-eb47-486b-af0c-e10b222188e8)
# Example-1
```
class Parent{
    public void property(){
        System.out.println("1 kg gold/2 flats/2 car");
    }
    public void marriage(){
        System.out.println("Parent Class");
    }
}
class child extends Parent{
    public void marriage(){
        System.out.println("Child Class");
    }
}
public class Overriding{
    public static void main(String[] args) {
        child c = new child();
        c.property();
        c.marriage();
    }
}
```
![image](https://github.com/user-attachments/assets/a3ae7680-35c6-4f16-9bd5-c57d65a9aae5)
# Example-2(While overriding we can not decrease the visibility of the method.(public>protected>default>private))
```
class Parent{
    protected void property(){
        System.out.println("1 kg gold/2 flats/2 car");
    }
    public void marriage(){
        System.out.println("Parent Class");
    }
}
class child extends Parent{
    public void marriage(){/////Here we increase the visibility from protected to public but we can not decrease the visibility
        System.out.println("Child Class");
    }
}
public class Overriding{
    public static void main(String[] args) {
        child c = new child();
        c.property();
        c.marriage();
    }
}
```
![image](https://github.com/user-attachments/assets/a3ae7680-35c6-4f16-9bd5-c57d65a9aae5)
# Example-3(While overriding the method resolution for JVM is based on the creation of the runtime object)
```
class Parent{
    protected void property(){
        System.out.println("1 kg gold/2 flats/2 car");
    }
    public void marriage(){
        System.out.println("Parent Class");
    }
}
class child extends Parent{
    public void marriage(){
        System.out.println("Child Class");
    }
}
public class Overriding{
    public static void main(String[] args) {
        child c = new child();
        c.property();
        c.marriage();
        Parent p = new Parent();
        p.property();
        p.marriage();
        Parent p1 = new child();//In overriding when the runtime whatever object is created only that object's method or property will be shown
        p1.marriage();
    }
}
```
![image](https://github.com/user-attachments/assets/2eb52f3d-7525-4c5f-9bcd-4f4f69519771)
# Overriding with respect to static method(Impossible)
![image](https://github.com/user-attachments/assets/4886d2b5-25e2-49e9-a227-77b8ad0b6810)
![image](https://github.com/user-attachments/assets/6b6ac50f-55ed-499d-af5c-648db474e495)
# Overriding with respect to private keyword
- We can't override the private method.
![image](https://github.com/user-attachments/assets/3bfb5455-02a6-45ce-9a84-2140400295e1)
# Example(Overriding with private keyword)
![image](https://github.com/user-attachments/assets/5106f822-a871-4f71-b698-94d5d08d5dab)

