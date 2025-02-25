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
1. Static blocks are only executed once, when the class is first loaded. A static block is responsible for initializing static variables.
2. They cannot access instance variables or instance methods, as those only exist within objects.
3. They can access other static variables and methods of the class.
4. We can't declare a class with static but inner classes can be declared as static.
5. In the case of instance variable for every object a separate copy will be created but in the case of a static variable, a single copy will be created at class level and shared by all objects of that class.
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
class ClassRoom{
    //Static data
    static String Blackboard= "BlackBoard is Visible for Every Student";
    //Non Static/Instance Data
    String sName;
    int sId; 
}
public class Static{
    //Non Static Area
    public void m1(){
    System.out.println(ClassRoom.Blackboard);
    }
    //Static Area
    public static void main(String[] args) {
        ClassRoom c1= new ClassRoom();
        ClassRoom c2= new ClassRoom();
        System.out.println(c1.Blackboard);
        System.out.println(c2.Blackboard);
        System.out.println();
        //Non Static data we can access through object only and unable to access directly
        c1.sName="Lala";
        c1.sId=1000;
        c2.sName="Shyam";
        c2.sId=2000;
//////Impossible to access data using ClassName but possible to access data using Object creation for non static Variable
        // System.out.println("C1 = " + ClassRoom.sName + ":" + ClassRoom.sId + ":" + ClassRoom.Blackboard);
        // System.out.println("C2 = " + ClassRoom.sName + ":" + ClassRoom.sId + ":" + ClassRoom.Blackboard);
//////Possible to access data using ClassName also without object creation for static Variable        
        System.out.println("C1 = " + c1.sName + ":" + c1.sId + ":" + ClassRoom.Blackboard);
        System.out.println("C2 = " + c2.sName + ":" + c2.sId + ":" + ClassRoom.Blackboard);
    }
}
```
# Output:
```
BlackBoard is Visible for Every Student
BlackBoard is Visible for Every Student

C1 = Lala:1000:BlackBoard is Visible for Every Student
C2 = Shyam:2000:BlackBoard is Visible for Every Student
```
![image](https://github.com/user-attachments/assets/a64aa69c-2ab3-40d6-a6b4-8c5f82d7fa9d)
# Example-4
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
# Example-6(Automatically Execution without Main method)
![image](https://github.com/user-attachments/assets/3a772993-dea4-4b77-91ff-c6002a3b6846)
# Example-7(Manually Execution Impossible without main method)
> ### But Till Java version 5 Manually Execution is possible without main method to execute static method
![image](https://github.com/user-attachments/assets/7e823090-bf90-496e-b209-2ce0412090c0)
# Static Method Vs Non-Static Methods
![image](https://github.com/user-attachments/assets/879ca7b8-b7b7-4a6b-9994-4ee363328f3e)
# Example-1(Static Method we can use class name or without class name)
```
class Student{
    /////Static data/class level data
    static String schoolName= "City Public School";
    static String principalName="Ramesh";
    ////Non Static Data/Instance data
    int sId;
    String sName;
    String pinCode;
    ////Static Method
    public static String getSchoolDetails(){
        return "School Name:"+schoolName+"\nPrincipal Name"+principalName;
    }
    //Non Static Method
    public String getStudentDetails(){
        return sId + ":" + sName + ":" + pinCode;
    }
}
public class Static_NonStatic{
    public static void main(String[] args) {
        Student firstStud = new Student();
        Student secStud = new Student();
        firstStud.sId=101;
        firstStud.sName="Ram";
        firstStud.pinCode="20801";
        secStud.sId=102;
        secStud.sName="Shyam";
        secStud.pinCode="203213";
        //Class Name:
        System.out.println(Student.getSchoolDetails());
        System.out.println();
        System.out.println(firstStud.getSchoolDetails());
    }
```
## Output:
```
School Name:City Public School
Principal NameRamesh

School Name:City Public School
Principal NameRamesh
```
# Example-2(Non Static Method we can call only with objects only)
```
class Student{
    /////Static data/class level data
    static String schoolName= "City Public School";
    static String principalName="Ramesh";
    ////Non Static Data/Instance data
    int sId;
    String sName;
    String pinCode;
    ////Static Method
    public static String getSchoolDetails(){
        return "School Name:"+schoolName+"\nPrincipal Name"+principalName;
    }
    //Non Static Method
    public String getStudentDetails(){
        return sId + ":" + sName + ":" + pinCode;
    }
}
public class Static_NonStatic{
    public static void main(String[] args) {
        Student firstStud = new Student();
        Student secStud = new Student();
        firstStud.sId=101;
        firstStud.sName="Ram";
        firstStud.pinCode="20801";
        secStud.sId=102;
        secStud.sName="Shyam";
        secStud.pinCode="203213";
/////****************Non Static Method we can call only with objects only */
        System.out.println(firstStud.getSchoolDetails());
        System.out.println();
        System.out.println(firstStud.getStudentDetails());
        System.out.println();
        System.out.println(secStud.getSchoolDetails());
        System.out.println();
        System.out.println(secStud.getStudentDetails());
    }
}
```
## Output:
```
School Name:City Public School
Principal NameRamesh

101:Ram:20801

School Name:City Public School
Principal NameRamesh

102:Shyam:203213
```
# Example-3(We can not take non-static data in static area)
![WhatsApp Image 2025-02-25 at 12 32 21_1d735f8c](https://github.com/user-attachments/assets/d0e45ca0-c8dc-4b5f-b107-5015f81f257d)
# Example-4(In non static area We can take static and non-static data both)
```
class Student{
    /////Static data/class level data
    static String schoolName= "City Public School";
    static String principalName="Ramesh";
    ////Non Static Data/Instance data
    int sId;
    String sName;
    String pinCode;
    public String getStudentDetails(){
        //////Example-4 In non static area We can take static and non-static data both
        return sId + ":" + sName + ":" + pinCode + ":" + "SchoolName is"+":"+schoolName +"and Principal Name is" + ":"+ principalName;
    }
}
public class Static_NonStatic{
    public static void main(String[] args) {
        Student firstStud = new Student();
        Student secStud = new Student();
        firstStud.sId=101;
        firstStud.sName="Ram";
        firstStud.pinCode="20801";
        secStud.sId=102;
        secStud.sName="Shyam";
        secStud.pinCode="203213";
//////Example-4In non static area We can take static and non-static data both
        System.out.println(firstStud.getStudentDetails());
        System.out.println();
        System.out.println(secStud.getStudentDetails());
    }
}
```
## Output:
```
101:Ram:20801:SchoolName is:City Public Schooland Principal Name is:Ramesh

102:Shyam:203213:SchoolName is:City Public Schooland Principal Name is:Ramesh
```
