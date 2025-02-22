# Overloading

## 1. Definition
When we define more than one constructor or more than one method with the same name, it is called **Overloading**.

## 2. Constructor Overloading
### a. Definition
Constructor overloading occurs when we define more than one constructor in a class.
### b. Conditions for Overloading
  1. **Argument must be different for overloading**
  2. **Number of parameters / type of parameters / order of parameters**
  3. **At Least one of above must be different for overloading.**

At least one of the above criteria must be different for overloading.
```
public class Constructor_Overload { 
    public static void main(String[] args) {
        Constructor_Overload Constructor_Overload_Without_Parameter = new Constructor_Overload();
        Constructor_Overload Constructor_Overload_With_Parameter= new Constructor_Overload(1000 ,2000);
    }
    int x;
    int y;
    // constructor overload
    // non-parameterized constructor
    public Constructor_Overload() {
        System.out.println("Creating object:Non-Parameterized construcotr");
        x = 100;
        y = 200;
        System.out.println("x = " + x + ", y = " + y);
        
    }
    public Constructor_Overload(int a, int b) {
        System.out.println("Creating object: Parameterized Construtor");
        x = a;
        y = b;
        System.out.println("x = " + x + ", y = " + y);
    }
}
```
# Output:
```
Creating object:Non-Parameterized construcotr
x = 100, y = 200
Creating object: Parameterized Construtor
x = 1000, y = 2000
```
## 3. Method Overloading
### a. Definition
Method overloading happens when we define more than one method with the same name but with a different argument list.

![image](https://github.com/user-attachments/assets/59e2887e-42f3-482a-99d6-ab7fe893fc3b)

![image](https://github.com/user-attachments/assets/7f1d87fe-4203-46ad-ba03-4370d58069ee)

# Conditions for Method Overloading

1. **Arguments must be different** for overloading.
2. Overloading can differ by:
   - **Number of parameters**
   - **Type of parameters**
   - **Order of parameters**
3. At least one of the above criteria must be different for overloading.
4. The **name of the method must be the same**.
5. The **return type can be different**.
6. Methods must be defined in the **same class**.
7. **Java compiler will resolve this at compile time-based on number of parameters, datatype of parameter and order of the parameters.**

## Example-1
```
public class Calculator {

    int x;
    int y;

    // constructor overload
    // non-parameterized constructor
    public Calculator() {
        System.out.println("Creating object:Non-Parameterized construcotr");
        x = 10;
        y = 20;
    }

    public Calculator(int a, int b) {
        System.out.println("Creating object: Parameterized Construtor");
        x = a;
        y = b;
    }

    // method overload

    public void sum() {
        System.out.println("sum is " + (x + y));
    }

    public int sum(int a) {
        System.out.println("sum is " + (x + y + a));
        return (x + y + a);

    }

    public double sum(int a, int b) {
        System.out.println("sum is " + (x + y + a + b));
        return (x + y + a + b);
    }
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator(200, 100);

        c1.sum();
        c2.sum();
        int result1 = c1.sum(50);

        double result = c1.sum(1, 2);
        System.out.println(result);
        System.out.println(result1);

    }
}
//IF we want to keep the main class in a different file the we use a different class with the different file name
// public class CalcDemo {
//     public static void main(String[] args) {

//         Calculator c1 = new Calculator();
//         Calculator c2 = new Calculator(200, 100);

//         c1.sum();
//         c2.sum();
//         int result1 = c1.sum(50);

//         double result = c1.sum(1, 2);
//         System.out.println(result);
//         System.out.println(result1);

//     }
// }
```
![image](https://github.com/user-attachments/assets/e705eee9-56e3-437c-ab87-2603e562027a)

## Example-2
```
class AdditionCalc
{

	int add(int n1, int n2) //Method Overloading
	{
		return n1+n2;
	}
	
	int add(int n1, int n2, int n3) //Method Overloading
	{
		return n1+n2+n3;
	}
	
	double add(int n1, double n2) //Method Overloading
	{
		return n1+n2;
	}
//	void add(int n1, double n2)
//	{
//		double res= n1+n2;
//	}
	double add(double n1, int n2) //Method Overloading
	{
		return n1+n2;
	}
	
	double add(double n1, double n2) //Method Overloading
	{
		return n1+n2;
	}

	double add(int n1, double n2, double n3) //Method Overloading
	{
		return n1+n2+n3;
	}
	
	double add(double n1, double n2, double n3) //Method Overloading
	{
		return n1+n2+n3;
	}
	
}

public class LaunchMo 
{

	public static void main(String[] args) //Main Method
	{
		int x=10;
		int y=20;
		int z=30;
		double a=10.5;
		double b=20.5;
		double c=30.5;
		
		AdditionCalc cal=new AdditionCalc();//Creation Of Object/Instantiation
		
//		int res=cal.add(x, y);
//		System.out.println(res);
		System.out.println(cal.add(x, y));
		System.out.println(cal.add(a,b));
		System.out.println(cal.add(x, y, z));
		System.out.println(cal.add(a, b, c));
		
	}

}
```
### Output
![image](https://github.com/user-attachments/assets/5b438ca5-7eb0-446d-9830-33dc43280edf)

## Example-3
```
class Mul{
 int mul(int x,int y){
     System.out.println("2 int Value");
     return x*y;
 } 
 double mul(int x,int y,double z){
     System.out.println("2 int 1 double");
     return x*y*z;
 }
  double mul(double x,double y,double z){
      System.out.println("3 double");
     return x*y*z;
 }
  double mul(int x,double y){
     return x*y;
 } 
   double mul(double x,int y){
     return x*y;
 } 
}
public class Launch {
    public static void main(String[] args){
        Mul m = new Mul();
        System.out.println(m.mul(4,4));
        System.out.println(m.mul(4,4,4));
        System.out.println(m.mul(44,44,44));
    }
}
```
### Output
![image](https://github.com/user-attachments/assets/7b175fca-191b-40d2-a572-6d4d5bd1e8fc)

## Example-4
```
class Mul{
 double mul(int x,int y,double z){
     System.out.println("2 int 1 double");
     return x*y*z;
 }
  double mul(double x,double y,double z){
      System.out.println("3 double");
     return x*y*z;
 }
  double mul(int x,double y){
      System.out.println("1 int 1 double");
     return x*y;
 } 
   double mul(double x,int y){
      System.out.println("1 double 1 int");
     return x*y;
 } 
}
public class Launch {
    public static void main(String[] args){
        Mul m = new Mul();
        System.out.println(m.mul(4,4));//It will throw an error because that type of arguments we are are passing
                                       //which is not able to receive these parameter
        System.out.println(m.mul(4,4,4));
        System.out.println(m.mul(44,44,44));
    }
}
```
### Output
![image](https://github.com/user-attachments/assets/672686bd-368b-407e-95ec-99db3b58e494)
## Example-4(Main Method Overloading possible)
```
public class LaunchMo3 
{
	public static void main(String[] args) 
	{
		System.out.println("main method with String of args[]");
		main(44);//main method with int of arg
		main("Rohan", 4);//main method with int and String of arg
	}
	public static void main(int arg) //Main Method Overloading
	{
		System.out.println("main method with int of arg");
	}
	public static void main(int[] arg) //Main Method Overloading with int[] argument
	{
		System.out.println("main method with int[] of arg");
	}
	public static void main(String name, int age) //Main Method Overloading with String and int argument
	{
		System.out.println("main method with int and String of arg");
	}
}
```
### Output
![image](https://github.com/user-attachments/assets/9f018202-30bc-4ec8-be9b-274a6373e4b4)
