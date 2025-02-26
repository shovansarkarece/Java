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
