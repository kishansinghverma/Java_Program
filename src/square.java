import java.util.Scanner;

class square
{
	void check_input()
	{
		System.out.println("Enter A Number:");
		int num=new Scanner(System.in).nextInt();
		int flag1=0, flag2=0;
		for(int i=1; i<=num/2; i++)
		{
			if((i*i)==num)
			{
				flag1=1;
				System.out.println("Perfect square of "+i);
				break;
			}
			if((i*i*i)==num)
			{
				flag2=1;
				System.out.println("Perfect Cube of "+i);
			}
		}
		if(flag1==0)
		{
			System.out.println("Not a Perfect Square Of Any Number");
		}
		if(flag2==0)
		{
			System.out.println("Not a Perfect Cube Of Any Number");
		}
	}
	void auto_generate_square(int num)
	{
		System.out.println("Perfect squares:");
		for(int i=1; true; i++)
		{
			if((i*i)>num)
			{
				break;
			}
			System.out.println(i*i);
		}
	} 
	void auto_generate_cube(int num)
	{
		System.out.println("Perfect Cubes:");
		for(int i=1; true; i++)
		{
			if((i*i*i)>num)
			{
				break;
			}
			System.out.println(i*i*i);
		}
	} 
	public static void main(String args[])
	{
		square obj=new square();
		while(true)
		{
		System.out.println("*******************\n1. Check A Number\n2. Generate Squares\n3. Generate Cubes\nChoose A Activity:");
		int choice=new Scanner(System.in).nextInt();
		int num=0;
		switch(choice)
		{
			case 1:
				obj.check_input();
				break;
			case 2:
				System.out.println("Enter Max Limit");
				num=new Scanner(System.in).nextInt();
				obj.auto_generate_square(num);
				break;
			case 3:
				System.out.println("Enter Max Limit");
				num=new Scanner(System.in).nextInt();
				obj.auto_generate_cube(num);
				break;
			default:
				System.out.println("Invalid Choice!!");
		}
		}
	}
}