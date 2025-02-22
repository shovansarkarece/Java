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
        Calculator Constructor_Overload_Without_Parameter = new Calculator();
        Calculator Constructor_Overload_With_Parameter= new Calculator(1000 ,2000);
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
