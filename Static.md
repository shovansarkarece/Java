# Static Keyword

1. **To create static variables**:
   a. `static int a = 50;`
2. **To create static methods**:
   a. `public static void test() { }`
3. **To create static blocks**:
   a. `static { }`

# Static Execution Flow

1. **Class Loading**:
2. **Static Variable Initialization**:
     1. **Default values**
     2. **Explicit initialization**
     3. **Static Block Execution (this is where they fit in)**
3. **Static Method (MAIN) Execution**:

## Points
1. Static blocks are only executed once, when the class is first loaded.
2. They cannot access instance variables or instance methods, as those only exist within objects.
3. They can access other static variables and methods of the class.
## Graphical Overview of Static Execution Flow
![image](https://github.com/user-attachments/assets/474a0df4-ae26-471e-8b48-8f8cdd0c187d)
# Example-1(Statc Variable cannot access instance variables)
![image](https://github.com/user-attachments/assets/4b619162-8b82-4293-a683-dacf033370d9)
# Example-2
```
public class Student {

    // static variables- single copy
    // all object will share same copy
    // 1
    static String college;
    static String collegeAddress = "Lucknow";
    static {
        System.out.println("static block 1");
    }
        public static void main(String[] args) {

    System.out.println("main mehtod");
    System.out.println(college);//Default value
    System.out.println(collegeAddress);
    }
    
}
```
# Output
![image](https://github.com/user-attachments/assets/95263963-bd60-4865-b4ae-da8bf9a60fa0)

# Example-3
```
public class Student {

    // static variables- single copy
    // all object will share same copy
    // 1
    static String college;
    static String collegeAddress = "Lucknow";
    static {
        System.out.println(college);//Default value
        System.out.println(collegeAddress);
        System.out.println("static block 1");
    }
        public static void main(String[] args) {
          System.out.println("main mehtod");
    }
    
}
```
# Output
![image](https://github.com/user-attachments/assets/761d80a8-6621-43cf-a64c-1c591bed5b68)
# Example-4
```
public class Student {

    // static variables- single copy
    // all object will share same copy

    // 1
    static String college;
    static String collegeAddress = "Lucknow";
    String studentname;
    // 2
    static {

        System.out.println(college);
        System.out.println(collegeAddress);
        System.out.println("static block 1");
    }
    // 3
      static {
        college = "ChintuCollege";
        collegeAddress = "ChintuChauraha";
        System.out.println("static block 2");
    }
    public static void main(String[] args) {
    System.out.println("main mehtod");
    System.out.println(college);
    System.out.println(collegeAddress);
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/b7204503-0608-481f-a838-d1c9da3d3bda)
# Example-5(Static after main method)
```
public class Student {

    // static variables- single copy
    // all object will share same copy

    // 1
    static String college;
    static String collegeAddress = "Lucknow";
    String studentname;

    // 2
    static {

        System.out.println(college);
        System.out.println(collegeAddress);
        System.out.println("static block 1");
    }

    public static void main(String[] args) {

    System.out.println("main mehtod");
    System.out.println(college);
    System.out.println(collegeAddress);
    }
    //Static after main method
    static {
        college = "ChintuCollege";
        collegeAddress = "ChintuChauraha";
        System.out.println("static block 2");
    }
}
```
# Output
![image](https://github.com/user-attachments/assets/3f8b6ce1-486d-49d5-95c6-2a263ca9aa8a)
# Example-5(Automatically Execution without Main method)
![image](https://github.com/user-attachments/assets/3a772993-dea4-4b77-91ff-c6002a3b6846)
# Example-7(Manually Execution Impossible without main method)
> But Till Java version 5 Manually Execution is possible without main method to execute static method
![image](https://github.com/user-attachments/assets/7e823090-bf90-496e-b209-2ce0412090c0)
