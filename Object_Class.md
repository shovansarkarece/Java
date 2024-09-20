# Objects and Classes
## Object:
1. An entity that has **states** (attributes/properties) and **behavior** is known as an object like car, chair, pen etc.
2. Real world entity which we can touch and feel.
3. Each Objects has unique identity : Properties and Behavior.
4. **Example:** Dogs have state (name, color, breed, hungry) and behavior (barking,
fetching, wagging tail).
## Class:
1. Blueprint from which individual objects are created. Blueprint is like creating design/ map before building a house. So, if any properties or behavior is mentioned in classs, the objects created from class will get the same properties and behavior as like mentioned in the blueprint i.e in class
2. Class is a collection of objects. It is possible create multiple objects from a class.
3. Class can have **properties** and **behaviors** declared
4. Object is instance of class. Therefore the properties and behaviors declared in class, the objects created from this class will have the same properties nad behaviors. The values of these properties could be different, but objects will have same properties and behaviors as like the class.
5. 
  ![image](https://github.com/user-attachments/assets/843bef87-5e0b-4cfa-b58a-a35b73beebd5)

6. Function created inside class is called **Method**
## Creating Class and Objects
1. Class can be created with **class** keyword.
2. Object is created with **new** keyword.
   ![image](https://github.com/user-attachments/assets/65bd5f7d-6b4f-4def-8da4-828ab503857d)

### Example of Creating Class & Object
~~~
class Start {
    public static void main(String[] args) {

        System.out.println("Printing something");
        // We need to create object
        Pen p1 = new Pen();
        Pen p2 = new Pen();
        //Value is updated before printing
        p1.model = "Matadoor";
        p2.model = "Fountain";

        //Value of color is updated
        p1.color = "black";
        p2.color = "blue";

        /*System.out.println(p1.model);
        System.out.println(p2.model);
        */

     // Method calling
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
}
~~~
### How does object creation look like?
![class](https://github.com/user-attachments/assets/12c829a5-e3dc-422e-8c93-73ad6fff5c4a)
# Variables and Methods in Classes
1. Classes are only blueprint for objects.
2. Variables are called data members/properties. (basically separate copy are created for
each object)[talking about instance variable here]
3. Methods are called member methods/behaviors/functionality.(each methods get
executed in object spaces ).[talking about instance/non-static methods]
4. Methods: set of instruction return for doing specific task.
## Example 
~~~
class Demo {
    public static void main(String[] args) {

        System.out.println("we are working here");
        // We need now to prepare Samosa according to blueprint
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

        // It is necessary to call/invoke non-static method with object
        s1.showColor();
        s2.showColor();
        int price = s1.getPrice();
        int price1 = s2.getPrice();

        System.out.println("total price " + (price + price1));

    }
}
//Samosa Class
public class Samosa {

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
~~~
![No name](https://github.com/user-attachments/assets/298030e0-102e-4f13-93a2-ee9e913d1c78)


