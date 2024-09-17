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

## 3. Method Overloading
### a. Definition
Method overloading happens when we define more than one method with the same name but with a different argument list.
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
