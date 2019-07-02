class ThisDemo
{
	int roll_no;
	String name;
	int age;
	
	void insert(int roll_no, String name, int age)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Roll No: "+roll_no+" Name: "+name+" Age: "+age);
	}
	public static void main(String args[])
	{
		ThisDemo obj1=new ThisDemo();
		ThisDemo obj2=new ThisDemo();
		ThisDemo obj3=new ThisDemo();

		obj1.insert(123,"Kishan",20);
		obj2.insert(234,"Rajat",21);
		obj3.insert(345,"Asad",22);

		obj1.display();
		obj2.display();
		obj3.display();
	}
}