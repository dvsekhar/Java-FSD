package pillarsofoops;

public class ClassObject {
	int custid;
	String custname;
	String custadd;
	static int count;
	public ClassObject(int id, String name, String add) {
		custid=id;
		custname=name;
		custadd=add;
		count++;
	}
	static void TotalCount()
	{
		System.out.println("No.of Customers visited: "+count);
	}
	void disp()
	{ 
		System.out.println("Customer ID: "+custid + "  Customer Name: "+custname+"  Customer Address: "+custadd);
	}

	public static void main(String[] args) {
		ClassObject c1=new ClassObject(26,"Ram","A Nagar");
		ClassObject c2=new ClassObject(6,"Rajiv","B Nagar");
		ClassObject c3=new ClassObject(126,"Ramya","C Nagar");
		ClassObject c4=new ClassObject(256,"Ramu","D Nagar");
		ClassObject c5=new ClassObject(64,"Ravi","E Nagar");
		ClassObject c6=new ClassObject(55,"Raj","F Nagar");
		c1.disp();
		c2.disp();
		c3.disp();
		c4.disp();
		c5.disp();
		c6.disp();
		ClassObject.TotalCount();

	}

}
