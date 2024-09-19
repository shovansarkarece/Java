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
- Constructors cannot be overridden.

![image](https://github.com/user-attachments/assets/cad342f9-eb47-486b-af0c-e10b222188e8)
