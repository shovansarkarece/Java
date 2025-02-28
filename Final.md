# Final Keyword
![image](https://github.com/user-attachments/assets/2a9ebb32-18c0-4755-bcd6-a03d6d2f15ef)
## Example-1(Before using final variables we must need to initialize the value because JVM won't provide ant default value to final instance variable.)
```
public class finaal{
    //****************Instance Variable**********************/
    int salary1;
    ////*****************Final Instance Variable**********************/
    final int salary;
    public static void main(String[] args){
        finaal a = new finaal();
        System.out.println(a.salary);
    }
}
```
![image](https://github.com/user-attachments/assets/32d7f083-f529-47b1-a1ec-a6dc418e2f8e)
## Example-2(Here we initialize the final keyword's value.) 
```
public class finaal1{
    //****************Instance Variable**********************/
    int salary1;
    ////*****************Final Instance Variable**********************/
    final int salary=10000;
    public static void main(String[] args){
        finaal1 a = new finaal1();
        System.out.println("Final Keyword's value is"+":"+a.salary);
    }
}
```
![image](https://github.com/user-attachments/assets/c66707da-c794-437e-94b0-536c02c28e6f)
## Example-3(Reinitialize the value impossible for final keyword)
![image](https://github.com/user-attachments/assets/099ab247-90ff-4374-adb9-181c37d98b5a)
# Three Ways to use final keyword in terms of declaring variable.
![image](https://github.com/user-attachments/assets/c99e40af-d3b7-455a-8d27-2929b701b245)
# Final Static Variable
- **For final static variable JVM won't provide any default values hence we have to initialize before using that.**
- **Static block load inside the memory at the time of class loading.**
- **Static variable load inside the memory at the time of class loading.**

![image](https://github.com/user-attachments/assets/52ecef6a-5aa4-4eda-86bd-d2711aad4f5e)
# Example
![image](https://github.com/user-attachments/assets/7f6c3687-65bd-40ed-b605-0e9bed1ae553)
# Final Local Variable
![image](https://github.com/user-attachments/assets/de000d9f-ad87-431f-b034-946b366778a2)
# Example
![image](https://github.com/user-attachments/assets/d413f6b0-561c-40ef-a4b9-60a7f5fdd492)
# Final Class
![image](https://github.com/user-attachments/assets/7e5e68a9-e251-47f6-8eb8-fec2e8cb02ad)
