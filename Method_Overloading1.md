# Method Overloading
- Method overloading refers to creating multiple methods within the same class with the same name but different parameters.
- Java compiler will resolve this at compile time-based on number of parameters, datatype of parameter and order of the parameters. 

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
