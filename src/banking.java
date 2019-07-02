import java.util.Scanner;
public class banking
{
	static int total_bal=0;
	static int cust_count=0;
	static banking customer[]=new banking[10];

	int balance;
	String c_name;
	int c_id;

 banking()
 {
	Scanner sc=new Scanner(System.in);

	c_id=cust_count+1;
	System.out.println("Enter Customer Name: ");
	c_name=sc.next();
	System.out.println("Enter Initial Balance: ");
	balance=sc.nextInt();
	total_bal += balance;
	cust_count++;
 }
 static int register()
 {
	int id=cust_count;
	customer[id]=new banking();
	return id;
 }
 static void login(int id)
 {
	try
	{
		customer[id].display();
		System.out.println("\n1. Withdraw.\n2. Deposit.\n3. Transfer.\n4. Logout.\nChoose a Operation:");
		int choice=new Scanner(System.in).nextInt();
		int amt;
		switch(choice)
		{
			case 1:
			System.out.println("Enter Amount To Widthdraw:");
			amt=new Scanner(System.in).nextInt();
			customer[id].withdraw(amt);
			break;
			
			case 2:
			System.out.println("Enter Amount To Deposit:");
			amt=new Scanner(System.in).nextInt();
			customer[id].deposit(amt);
			break;
			
			case 3:
			System.out.println("Enter Payee A/c No:");
			int ac=new Scanner(System.in).nextInt();
			System.out.println("Enter Amount To Transfer:");
			amt=new Scanner(System.in).nextInt();
			customer[id].transfer(ac-1,amt);
			break;
		}
	}
		catch(Exception e)
		{
			System.out.println("\nA/c No. Not Valid!!");
		}
 }
 void display()
 {
	System.out.println("********* Account Details **********");
	System.out.println("Account No: "+c_id);
	System.out.println("Customer Name: "+c_name);
	System.out.println("Available Amount: "+balance);
 }
 void withdraw(int amt)
 {
	if(balance>=amt)
	{
		balance -= amt;
		total_bal -= amt;
		System.out.println("\n"+amt+" Rs. Withdrawn Successfully!");
	}
	else
	{
		System.out.println("\nInsufficient Fund!!");
	}
	login(c_id-1);
}
 void deposit(int amt)
 {
	balance += amt;
	total_bal += amt;
	System.out.println("\n"+amt+" Rs. Deposited Successfully!");
	login(c_id-1);
 }
 void transfer(int id, int amt)
 {
	try
	{
		if(c_id-1==id)
		{
			System.out.println("\nCan't Transfer To Self!!");
		}
		else
		{
			if(balance>=amt)
			{
				customer[id].balance += amt;
				balance -= amt;
				System.out.println("\n"+amt+" Rs. Transferred To A/c No "+(id+1)+" ("+customer[id].c_name+")");
			}
			else
			{
				System.out.println("\nInsufficient Fund!!");
			}
		}
	}
	catch(Exception e)
	{
		System.out.println("\nPayee A/c No. Not Exists!!");
	}
	login(c_id-1);
 }
 static void manager()
 {
	System.out.println("************* Manager **************");
	System.out.println("Total Balance: "+total_bal);
	System.out.println("Total Customer: "+cust_count);
 }
 public static void main(String args[])
 {

	System.out.println("************************************\n1. Manager.\n2. Open Account.\n3. Login.\nChoose a Activity: ");
	int choice=new Scanner(System.in).nextInt();
	switch(choice)
	{
		case 1:
			manager();
			break;
		case 2:
			try
			{
				int id=register();
				customer[id].display();
			}
			catch(Exception e)
			{
				System.out.println("\nUser Limit Exceeded!");
			}
			break;
		case 3:
			System.out.println("Enter A/c No: ");
			int ac=new Scanner(System.in).nextInt();
			login(ac-1);
			break;
		default:
			System.out.println("\nInvalid Operation!!");
	}
	main(null);
 }
}
