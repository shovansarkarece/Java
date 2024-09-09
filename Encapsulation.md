# Encapsulation: 
- This principle focuses on the bundling of related data and functions into an object, allowing access only through the object's methods.
- It helps in hiding the internal implementation details and protects the data from unauthorized access.
- The main advantage of encapsulation is that data is hidden and protected from randomly access by outside non-member methods of a class.
- Encapsulation is the process of binding data and methods in a single unit.
- In encapsulation, data(variables) are declared as private, and methods are declared as public
- To encapsulate something is to enclose something, in our case, we encapsulate or wrap data into a single unit essentially binding the data and code together.
- ![image](https://github.com/user-attachments/assets/839257ed-3b64-4def-b955-0fa9f77daf25)
![image](https://github.com/user-attachments/assets/20ed2e10-0c86-427d-a68e-bf32362bdb79)
### How to achieve encapsulation?
> Through access specifiers private,protected,public,default.We can achieve encapsulation.
### Benefit of encapsulation
- Helpful in to achieve abstraction for security point of view it is most beneficial.
- We can maintain log file through method when you bind your data with method.

## How to use private data?
- Using setters and getters method we can set and get the value of variable.
# Note
- Always make variable as private and method as public to achieve  security in program.
## Example-1
```
class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int a)
	{
		age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
```
## Example-2
```
class Book
{
	private int pageNum;
	//setter
	void setPageNum(int pgNo)
	{
		if(pgNo>=0)
		{
			pageNum=pgNo;
		}
		else
		{
			System.out.println("Kindly add non zero number");
		}
	}
	//getter
	int getPageNum()
	{
		return pageNum;
	}
	void disp()
	{
		System.out.println("Java and Inheritance is present in pageNumber : "+ pageNum);
	}

}

public class LaunchEncap 
{

	public static void main(String[] args) 
	{
		Book book=new Book();
		//book.pageNum=-4;
		book.setPageNum(44);
		
	//	System.out.println(book.pageNum);
		System.out.println(book.getPageNum());
		
	//	System.out.println(book.pageNum);
		book.disp();

	}

}
```
## Example-3
```
class Employee1
{
	private int id;
	private String name;
	
	//setter
	void setId(int i)
	{
		id=i;
	}
	
	void setName(String n)
	{
		name=n;
	}
	
	
	//getter
	int getId()
	{
		return id;
	}
	
	String getName()
	{
		return name;
	}
}


public class LaunchEmp 
{

	public static void main(String[] args) 
	{
		Employee1 emp=new Employee1();
		//emp.id=1;
		
		emp.setId(4);
		emp.setName("Rohan");
		
	//	System.out.println(emp.id);
		System.out.println(emp.getId());
		System.out.println(emp.getName());

	}

}
```
### Example-4
```
class Learner
{
	private int id;
	private String name;
	private String city;
//	Learner()
//	{
//		
//	}
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
		
}

public class LaunchLearner 
{
	public static void main(String[] args) 
	{
		Learner learner=new Learner();
		learner.setId(1);
		learner.setName("Rohan");
		learner.setCity("bengaluru");
		
		
		int id=learner.getId();
		System.out.println("Id is : "+ id);
		
		System.out.println(learner.getName());
		System.out.println(learner.getCity());
		
		System.out.println("********************************");
		
		Learner learner2=new Learner();
		learner2.setId(2);
		learner2.setName("Rohit");
		learner2.setCity("mumbai");
		
		
		int id2=learner2.getId();
		System.out.println("Id is : "+ id2);
		
		System.out.println(learner2.getName());
		System.out.println(learner2.getCity());
		
	}
}
```
