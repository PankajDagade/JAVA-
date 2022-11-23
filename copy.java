import java.lang.*;
class Employee implements Cloneable
{
    public int EID;
	public String Ename;
	public int Esalary;
	
	
	public Employee(int id, String str,int no)
	{
	this.EID = id;
	this.Ename = str;
	this.Esalary = no;
	}
	
	
	
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class copy
{
	public static void main(String arg[])throws Exception
	{
		Employee eobj = new Employee(11,"Pankaj",210000);
		System.out.printf(" EID :"+eobj.EID+"  Name :"+eobj.Ename+"  salary :"+eobj.Esalary);
		
		Employee eobjX = (Employee)eobj.clone();
		System.out.printf(" EID :"+eobjX.EID+"  Name :"+eobjX.Ename+" salary :"+eobjX.Esalary);
		
		eobj.Ename = "Pankaj";
		System.out.printf(" EID :"+eobjX.EID+"  Name :"+eobjX.Ename+" salary :"+eobjX.Esalary);
	}
}
