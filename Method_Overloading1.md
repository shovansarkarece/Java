# Method Overloading
- Method overloading refers to creating multiple methods within the same class with the same name but different parameters.
- Java compiler will resolve this at compile time-based on number of parameters, datatype of parameter and order of the parameters. 
> In method overloading while writing the method signature we have to follow following 3 Rules.
1. Method name must be same for all methods.
2. List of parameters must be different like different type of parameters, different numbers of parameters, and different order of parameters.
3. Return type is not considered in method overloading; it means we never decide method overloading with return type
## Example-1
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

## Example-2
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

## Example-3
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

