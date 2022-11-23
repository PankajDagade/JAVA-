import java.lang.*;
class Employee 
{  
	public String name;
	public int Salary;
}
	
	public Employee( String str,int no)
	{
	
	     this.name = str;
	     this.Salary = no;
	}
	publicString toString()
	{
		return name+"->"+Salary;
	}
}
class Object1
{
	public static void main(String arg[])
	{
		Employee eobj = new Employee("Pankaj",1000);
		System.out.println(eobj.toString());
	}
}
