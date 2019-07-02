interface calculator
{  
	void calc(int a, int b);  
}  
class test implements calculator
{
	public void calc(int a, int b)
	{
		System.out.println("Difference: "+(a-b));
	}
}
class test2 implements calculator
{  
	public void calc(int a, int b)
	{
		System.out.println("Sum: "+(a+b));
	}  
	public static void main(String args[])
	{  
		test2 obj2 = new test2();  
		test obj=new test();
		obj.calc(47,23);  
		obj2.calc(45,20);
 	}  
} 