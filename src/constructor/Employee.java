package constructor;

public class Employee {
	private int eno;
	private String ename;
	private double sal;
	
	Employee()
	{
		this(256,"Ravi",50000);
	}
	
	Employee(int no, String name, double salary)
	{
		eno=no;
		ename=name;
		sal=salary;
		this.disp();
		
	}
	public void disp()
	{
		System.out.println("EMP ID: "+eno);
		System.out.println("EMP Name: "+ename);
		System.out.println("EMP Salary: "+sal);
		
	}
	public static void main(String []args)
	{
		Employee e=new Employee();
	}

}
