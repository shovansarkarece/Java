# Method Overloading
- Method overloading means declaring multiple methods with same method name but having different method signature.
- In method overloading while writing the method signature we have to follow following 3 Rules
> Method name must be same for all methods
1. List of parameters must be different like different type of parameters,
2. different number of parameters, different order of parameters.
3. Return type is not considered in method overloading; it means we never
    decide method overloading with return type
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
