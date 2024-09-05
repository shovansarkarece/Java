class Student
{
	String name;
	int age;
	int id;
	void studying()
	{
		System.out.println("Student is styding");
	}
	void playing()
	{
		System.out.println("Student is playing");
	}
}
public class Launch1 
{
	public static void main(String[] args) 
	{
		Student st=new Student();//Creation Of Object/Object Creation/Instiation
		st.studying();
		st.playing();
	}

}
