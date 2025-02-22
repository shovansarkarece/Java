# Constructor
1. Block of code gets executed automatically when an object is created.
2. Similar to methods.
3. Constructor and class name must be the same.
4. Constructor does not return any value.
5. Example.
6. Types of Constructor:
   - **Parameterized** - constructor that takes 1 or more parameters in the argument list.
     - `new Demo(int a, int b);`
   - **Non-Parameterized** - constructor that does not take any parameters in the argument list.
     - `new Demo();`

![image](https://github.com/user-attachments/assets/3135ac04-71bb-4a68-a1ed-c1114d0f3f39)

![image](https://github.com/user-attachments/assets/e2bf9f88-8ab1-4a58-8306-efcd0f878254)

![image](https://github.com/user-attachments/assets/0b7f2029-9ba3-4594-87f2-fc4aae2aa7fd)

## Example
```
public class Jalebi {

    // variables
    int price;
    String name;

    // constructor-invoked automatically- jab object create hoga

    // objects create karte samay hi--- values initialize kar denge
    public Jalebi(int p, String n) {
        System.out.println("This is constructor");
        price = p;
        name = n;
    }

    // methods
    public void showPrice() {
        System.out.println("Price is " + price);
    }

    public void displayAll() {
        System.out.println("Price : " + price);
        System.out.println("Name : " + name);
    }

}
public class JalebiDemo {
    public JalebiDemo() {
    }
 
    public static void main(String[] var0) {
       Jalebi var1 = new Jalebi(500, "Green Jalebi");// Parameterized Constructor Calling(Recommended Procedure) 
       Jalebi var2 = new Jalebi(600, "Red Jalebi");// Parameterized Constructor Calling(Recommended Procedure) 
       var1.displayAll();
       var2.displayAll();
    }
 }
//JalebiDemo Class With Another Example
public class JalebiDemo {
    public static void main(String[] args) {

        Jalebi j1 = new Jalebi(500, "Green Jalebi"); //Parameterized Constructor Calling(Recommended Procedure)

        // j1.price = 500;//Unnecessary Object Creation not recommended
        // j1.name = "Green Jalebi";//Unnecessary Object Creation not recommended

        // j1.showPrice();//Unnecessary Object Creation

        Jalebi j2 = new Jalebi(600, "Red Jalebi");//Parameterized Constructor Calling(Recommended Procedure)

        // j2.price = 600;
        // j2.name = "Red Jalebi";

        // j2.showPrice();

        j1.displayAll();
        j2.displayAll();

    }
}
```
> 1.It is not important to create any  constructor in java class.
> Because when we don't create any constructor in class  then java compiler create on default constructor for us.

![image](https://github.com/user-attachments/assets/c42e61a1-2060-49f0-8a98-d386897ca552)
