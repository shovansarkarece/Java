![image](https://github.com/user-attachments/assets/3e60e658-77b9-43c4-8af0-79dc8c0960cd)
![image](https://github.com/user-attachments/assets/16a5b6af-8a75-411e-9e2c-6a919cb189b1)
![image](https://github.com/user-attachments/assets/5b136622-a4a4-46af-a7a3-5619e67f2129)
# Example-1
```
class Demo
{
	public static void main(String[] args) {
		

		// int ka array banane ja rhe hai:
		int marksArray[]={ 89, 90, 40, 77, 85 };////We use this syntax when we know about our values

		int length=marksArray.length ;

		System.out.println("length of marksArray "+length);

		// double marksInDecimal[]; //declaration
		// marksInDecimal=new double[5];//initilization

		double[] marksInDecimal=new double[5]; ////We use this syntax when we don't know about our values and 
///**also we can use the [n] to do the array dynamic and also get the input size of the array from User

		System.out.println("length of marksin Decimal "+marksInDecimal.length);	

		System.out.println("accessing array values");

		System.out.println(marksArray[1]);//90	
		System.out.println(marksArray[3]);//77

		System.out.println(marksArray[0]+marksArray[3]);

		System.out.println("accessing all array values using simple loop");

		for(int i=0 ; i<marksArray.length;i++)
		{
			System.out.println(marksArray[i]);
		}
		

		System.out.println("Accessing array without values");
		for(int i=0;i<marksInDecimal.length;i++)
		{
			System.out.println(marksInDecimal[i]);
		}

		marksInDecimal[0]=99.1;
		marksInDecimal[4]=12.5;



		for(int i=0;i<marksInDecimal.length;i++)
		{
			System.out.println(marksInDecimal[i]);
		}

	}
}
```
# Output:
```
length of marksArray 5
length of marksin Decimal 5
accessing array values
90
77
166
accessing all array values using simple loop
89
90
40
77
85
Accessing array without values
0.0
0.0
0.0
0.0
0.0
99.1
0.0
0.0
0.0
12.5
```
# Example-2
```
public class BasicsOfArray {
    public static void main(String[] args) {
       int age[]; //declaration
       age = new int[5]; //allocation
       //int age[] = new int[5];
       age[0] = 5;
       age[1] = 2;
       System.out.println(age[0]);
       System.out.println(age[1]);
       System.out.println(age[2]);
       System.out.println(age.length);
       int marks[] = {98, 12, 45, 12, 65};
       System.out.println(marks[4]);
/////ForEach loop WIth Array
        String names[] = {"Ram", "Harish", "Karan", "Monty"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is "+names[i]);
        }}}
```
# Output:
```
5
2
0
5
65
Name is Ram
Name is Harish
Name is Karan
Name is Monty
```
![image](https://github.com/user-attachments/assets/9495e597-e863-4f12-a4ac-c28a34d7fbaf)

# Two Dimensional Array
![image](https://github.com/user-attachments/assets/be90d861-f244-4040-b09c-cfd0103d023e)
![image](https://github.com/user-attachments/assets/5311f2be-0bbc-4ecb-90a2-26ba34609933)
# MultiDimensional Array__Example-1
```
public class ProblemOnArrays {
    public static void main(String[] args) {
            int marks[][] = {
                {12, 98, 34},
                {12, 67, 87},
                {12, 98, 23},
                {14, 67, 36}
        };
        System.out.println(marks[2][1]);
        System.out.println(marks[2][2]);
        System.out.println(marks[1][2]);
//////**************Just For Clear Understanding***************************
       marks[0][0] = 12;
       marks[0][1] = 98;
       marks[0][2] = 34;

       marks[1][0] = 12;
       marks[1][1] = 67;
       marks[1][2] = 87;

       marks[2][0] = 12;
       marks[2][1] = 98;
       marks[2][2] = 34;

       marks[3][0] = 12;
       marks[3][1] = 67;
       marks[3][2] = 87;
    }}
```
# Output:
```
98
23
87
```
# ForEach Loop__Example-1
```
import java.util.ArrayList;
class ForEach
{
	public static void main(String[] args) {
		
		int arr[]={123,124,1242,35,346};

		// accessing using for each loop
		for(int x:arr)
		{
			System.out.println("value of x = "+x);
		}
		String names[]={"ankit","sachin","surya","rahul"};

		for(String name:names)
		{
			System.out.println(name);
		}

		// 
		ArrayList<Integer> list=new ArrayList();
		list.add(124);
		list.add(2345);

		for(int y:list)
		{
			System.out.println(y);
		}


	}
}
```
# Output:
```
Note: ForEach.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
value of x = 123
value of x = 124
value of x = 1242
value of x = 35
value of x = 346
ankit
sachin
surya
rahul
124
2345
```
# ForEach Loop- Example-2
```
public class ProblemOnArrays {
    public static void main(String[] args) {
//////Example-1 Start Here
       System.out.println(Integer.MAX_VALUE);
       int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};
       int sum = 0;

       for (int number: numbers) {
           sum += number;
       }
       System.out.println("Sum is "+sum);
}}
```
# Output:
```
2147483647
Sum is 124
````
# ForEach Loop- Example-3
```
public class ProblemOnArrays {
    public static void main(String[] args) {
       int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};
       int min = Integer.MAX_VALUE;
       for (int number : numbers) {
           if(number < min) {
               min = number;
           }
       }
       System.out.println("minimum is "+min);
}}
```
# Output:
```
minimum is 2
```

