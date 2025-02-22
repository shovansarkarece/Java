# Object Oriented Programming
![image](https://github.com/user-attachments/assets/f7fb49a8-e895-44cd-8651-05d6f0fe599f)
![image](https://github.com/user-attachments/assets/64e18ce1-db23-4f57-96ba-bc417c90ece5)
![image](https://github.com/user-attachments/assets/aeb4355b-cc5b-43d8-b674-d1ffed1760e7)
![image](https://github.com/user-attachments/assets/40474024-2047-496c-becf-fe4041ecce95)
![image](https://github.com/user-attachments/assets/dd680ef2-70c9-415e-b1ac-19d0f033678c)
![image](https://github.com/user-attachments/assets/8a0c3572-2b28-4120-b2ed-831ff40772c9)
## Difference Between Clas and Object
![image](https://github.com/user-attachments/assets/0e126833-f0b0-4047-8ef5-6d27d7b7926d)
![image](https://github.com/user-attachments/assets/301b0fc6-65cb-41f3-ad15-818a9458fac9)
### Example Of Class and Object
```
class Start {
    public static void main(String[] args) {

        System.out.println("Printing something");
        // ek object create karne ki jarurat pad gyi
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        p1.model = "3 Rupya wala 1";
        p2.model = "5 Rupya  wala 1";

        p1.color = "black";
        p2.color = "blue";

        System.out.println(p1.model);
        System.out.println(p2.model);

        p1.write();

        p2.write();

    }
}
//Pen Class
class Pen {
    // class body
    // properties/variables[instance]/data members
    String color;
    double price;
    String model;
    // ......

    // behaviors/methods/member methods
    public void write() {
        System.out.println(model + " is writing in " + color + " Color");
    }

    // .....
}
```
# Output:
```
Printing something
3 Rupya wala 1
5 Rupya  wala 1
3 Rupya wala 1 is writing in black Color
5 Rupya  wala 1 is writing in blue Color
```
### Another Example Of Class and Object
```
public class MainClass {
    public static void main(String[] args) {

//        int age = 12;
//        Dog d1 = new Dog();
//        d1.name = "Tommy";
//        d1.bark();
//        d1.walk();
//
//        Dog d2 = new Dog();
//        d2.name = "Leo";
//        d2.walk();
    }
}
class Dog { // factory
    String name;
    int age;
    String color;

    void walk() {
        System.out.println(name+" is walking");
    }

    void bark() {
        System.out.println(name+" is barking");
    }
}
```
# Output:
```
Tommy is barking
Tommy is walking
Leo is walking
```
# Variables and Methods in Classes
- 1.Classes are only blueprint  for objects
- 2.Variables are called data members/properties. (basically separate copy are created for 
each object)[talking about instance variable here]
- 3.Methods are called member methods/behaviors/functionality. (each methods get executed in object spaces ).
[talking about instance/non-static methods]
- 4.Methods: set of instruction return for doing specific task.(jo ham pahle padh chuke hai.)
```
public class Demo {
    public static void main(String[] args) {

        System.out.println("we are working here");
        // ek samose ki jarurat padh gyi
        // want object of samosa
        Samosa s1 = new Samosa();//reference variable s1
        Samosa s2 = new Samosa();//reference variable s2

        s1.price = 3;
        s1.model = "Meetha Samosa";
        s1.shape = "triangular";
        s1.color = "Yellow";

        s2.price = 10;
        s2.model = "Mix Samosa";
        s2.shape = "rectangular";
        s2.color = "Reddish";

        s1.showColor();
        s2.showColor();
        int price = s1.getPrice();
        int price1 = s2.getPrice();

        System.out.println("total price " + (price + price1));

    }
}
//Samosa Class
class Samosa {

    // properties/variables/data members
    // instance variables/non-static variables
    int price;
    String model;
    String color;
    String shape;

    // behaviors/member methods
    // non-static methods/instance methods

    public void showColor() 
    {

        System.out.println("Color is " + color);
    }

    public int getPrice() {
        System.out.println("Price is : " + price);
        return price;
    }

}
```
# Output:
```
we are working here
Color is Yellow
Color is Reddish
Price is : 3
Price is : 10
total price 13
```
