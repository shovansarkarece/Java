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
# Example-3
```
class Demo2D
{
	public static void main(String[] args) 
	{
		// 2d array : 
		// 1. hame values pata hai(When we know the values)
		int arr[][]= { 
			{ 4,9,10,30 },
			{ 6,8,5,30 },
			{ 2,3,1,30},
			{ 11,8,2,30} 
		};
// 2D array print karne ka tareeka
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[0].length-1;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}}}
```
# Output
```
Output:
4   9   10  30 
6   8   5   30 
2   3   1   30 
11  8   2   30
```
![image](https://github.com/user-attachments/assets/9495e597-e863-4f12-a4ac-c28a34d7fbaf)

# Two Dimensional Array
![image](https://github.com/user-attachments/assets/be90d861-f244-4040-b09c-cfd0103d023e)
![image](https://github.com/user-attachments/assets/5311f2be-0bbc-4ecb-90a2-26ba34609933)
