class thisDemo
{
	int roll_no;
	String name;
	int age;
	static int count=0;
	
	void insert(int roll_no, String name, int age)
	{
		this.roll_no=roll_no;
		this.name=name;
		this.age=age;
		count++;
	}
	void display()
	{
		System.out.println("Roll No: "+roll_no+" Name: "+name+" Age: "+age);
	}
	public static void main(String args[])
	{
		thisDemo obj1=new thisDemo();
		thisDemo obj2=new thisDemo();
		thisDemo obj3=new thisDemo();

		obj1.insert(123,"Kishan",20);
		obj2.insert(234,"Rajat",21);
		obj3.insert(345,"Asad",22);

		obj1.display();
		obj2.display();
		obj3.display();
		System.out.println("Total Enrolled Students: "+count);
	}
}