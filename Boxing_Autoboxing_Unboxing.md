# Boxing 
- Converting primitive data type into its corresponding wrapper class object
```
import java.util.ArrayList;
public class LaunchWrapper 
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println("a "+a);
		
//		Integer i=new Integer(10); //Depricated
		Integer i=Integer.valueOf(10);
		System.out.println("i "+i);
}
}
```
# Auto Boxing
- Automatically Converting primitive data type into its corresponding wrapper class object by Java compiler
```
import java.util.ArrayList;
public class LaunchWrapper 
{
	public static void main(String[] args) 
	{
                int n1=14;
		Integer n2=n1;//auto boxing
}
}
```
# UnBoxing 
- Converting wrapper class object back to its corrsponding primitive data type
- Automatically Converting wrapper class object back to its corrsponding primitive data type by java compiler
