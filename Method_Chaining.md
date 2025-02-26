# Method Chaining
## Example-1
```
public class Method_Chaining{
    public void m1(){
        System.out.println("m1 zero arguments");
    }
    public void m1(int a){
        this.m1();
        System.out.println("m1 one arguments");
    }
    public void m1(int a, int b){
        this.m1(10);
        System.out.println("m1 two arguments");
    }
    public void m1(int a,int b,int c){
        this.m1(10,20);
        System.out.println("m1 three arguments");
    }
    public void m1(int a,int b,int c,int d){
        this.m1(10,20,30);
        System.out.println("m1 four arguments");
    }
    public static void main(String[] args) {
        Method_Chaining m= new Method_Chaining();
        m.m1(10,20,30,40);
    }
}
```
# Output:
```
m1 zero arguments
m1 one arguments
m1 two arguments
m1 three arguments
m1 four arguments
```
## Example-2
```
class SuperGrandParent{
    void m1(int a,int b,int c){
        System.out.println("m1-SuperGrandParent");
    }
}
class GrandParent extends SuperGrandParent{
    void m1(int a, int b){
        System.out.println("m1-GrandParent");
        super.m1(10,2,3);
    }
}
class Parent extends GrandParent{
    void m1(int a){
        System.out.println("m1-Parent");
        super.m1(10,2);
    }
}
class Child extends Parent{
    void m1(){
        System.out.println("m1-Child");
        super.m1(10);
    }
}
public class Method_Chaining1{
    public static void main(String[] args) {
        Child c= new Child();
        c.m1();
    }
}
```
# Output:
```
m1-Child
m1-Parent
m1-GrandParent
m1-SuperGrandParent
```
# Example-3
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
