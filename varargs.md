# VARARGS(varargs...)
- varargs method can take any amount of parameters but the type of all the parameters should be same.
- A method who is capable enough to take any amount of parameters of the same type.
- There should always be three dots. All the dots are together.
- Syantax:public void m1(int...a){}
- internally JVM provides an anonymous array(**new int[] {}**) that can receive unlimited same data type.
- Here implicit type casting like left-to-right data conversion is possible, which means automatic promotion in overloading.
- But right-to-left data conversion is impossible.
- Java 1.0(**Normal Methods**)>>Java 5.0(**Varargs Method**).So always normal method's priority is highest than varargs method.

![image](https://github.com/user-attachments/assets/c6d983b2-f26d-40f5-bd24-4c8534afc7a3)
Example-1
```
public class VARARGS{
    // public void m1(int...a){
        public void m1(double...a){
        System.out.println("varargs called"+ a.length);
    }
    public static void main(String[] args){
      VARARGS v= new VARARGS();
      v.m1(10);
      v.m1(10,20,30);
      //v.m1('Suva','Sarkar',20,30);//Not possible
    }
}
```
