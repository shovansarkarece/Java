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
       Jalebi var1 = new Jalebi(500, "Green Jalebi");
       Jalebi var2 = new Jalebi(600, "Red Jalebi");
       var1.displayAll();
       var2.displayAll();
    }
 }
//JalebiDemo Class With Another Example
public class JalebiDemo {
    public static void main(String[] args) {

        Jalebi j1 = new Jalebi(500, "Green Jalebi"); //Recommended Procedure 

        // j1.price = 500;//Unnecessary Object Creation
        // j1.name = "Green Jalebi";//Unnecessary Object Creation

        // j1.showPrice();//Unnecessary Object Creation

        Jalebi j2 = new Jalebi(600, "Red Jalebi");//Recommended Procedure 

        // j2.price = 600;
        // j2.name = "Red Jalebi";

        // j2.showPrice();

        j1.displayAll();
        j2.displayAll();

    }
}
```
