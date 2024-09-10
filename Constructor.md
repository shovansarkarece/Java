# Constructor
![image](https://github.com/user-attachments/assets/c5a5185c-5aec-49ad-9b56-c05ca19635d3)

```
class Dog
{
	private int cost;
	private String name;
	private String color;
	
	Dog(int cost, String name, String color)
	{
		this.cost=cost;
		this.name=name;
		this.color=color;
	}
	//Zero parameterized constructor
	Dog()
	{
		System.out.println("Zero param constructor");
		cost=4545;
		name="Lobo";
		color="black";
	}
	
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}

public class LaunchConstructor 
{

	public static void main(String[] args) 
	{
		Dog d1=new Dog(444, "Sheru", "White");
		
		System.out.println(d1.getCost());
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println("************************************");
		
		Dog d2=new Dog();
		System.out.println(d2.getCost());
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		
		

	}

}

```
## Output
![image](https://github.com/user-attachments/assets/8dfeb8c4-b0b1-4035-9bfb-11608c37a086)
# Parameterized Constructor
```
class Demo
{
	int num1,num2;
	
	Demo()
	{
		super();
		System.out.println("Zero param Constructors");
	}
	
	Demo(int num1, int num2)
	{
		this(num1);
		this.num1=num1;
		this.num2=num2;
		System.out.println("2 param constructor");
	}
	
	Demo(int num1)
	{
		this();
		this.num1=num1;
		num2=44;
		System.out.println("1 param constructor");
	}
	void disp()
	{
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

	}
	
}

public class LaunchConstructor3 
{

	public static void main(String[] args) 
	{
		Demo demo1=new Demo(4);
		demo1.disp();
		System.out.println("******************************");
		
		Demo demo2=new Demo(4,5);
		demo2.disp();

	}

}
```
# Output
![image](https://github.com/user-attachments/assets/3c887c1d-ae0f-4bca-9f25-269380309042)
