import java.util.Scanner;

public class atm 
{
    static int tc_100=0, tc_500=0, tc_2000=0;

    static int total()
    {
        return (tc_100*100)+(tc_500*500)+(tc_2000*2000);
    }

    static void manager()
    {
	        System.out.println("\n************* Manager Window *************");
		Scanner sc = new Scanner(System.in);
        	System.out.print("\nEnter No. of 2000 Notes: ");
		tc_2000 = Integer.parseInt(sc.next());
		System.out.print("\nEnter No. of 500 Notes: ");
		tc_500 = Integer.parseInt(sc.next());
		System.out.print("\nEnter No. of 100 Notes: ");
		tc_100 = Integer.parseInt(sc.next());	
    }

    static void withdraw()
    {
	System.out.println("\n************* Withdrawl Window *************");
	int t_100=0, t_500=0, t_2000=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Amount To Withdraw: ");    
        int amt = Integer.parseInt(sc.next());
        if(amt>10000)
        {
            System.out.println("Withdrawal Limit Exceeded!!");
            System.out.println("Amount Should Be Less Than 10000...");
        }
        else if(amt%100 !=0)
        {
            System.out.println("Invalid Withdrawal Amount!!");
            System.out.println("Amount Should Be In Multiple Of 100...");
        }
        else if(total()>=amt)
        {
            while(tc_2000>0 && amt>=2000)
            {
                t_2000++;
                amt -= 2000;
                tc_2000--;
            }
            while(tc_500>0 && amt>=500)
            {
                t_500++;
                amt -= 500;
                tc_500--;
            }
            while(tc_100>0 && amt>=100)
            {
                t_100++;
                amt -= 100;
                tc_100--;
            }
            System.out.println("2000 x "+t_2000+" = "+2000*t_2000);
            System.out.println("500 x "+t_500+" = "+500*t_500);
            System.out.println("100 x "+t_100+" = "+100*t_100);
        }
        else
        {
            System.out.println("Can't Dispence Cash!!\nCash Not Available...");
        }
    }	

    public static void main(String args[])
    {
        while(1==1)
	{
        	if(total()==0)
		{
			manager();		
		}
		withdraw();
    	}
    }
}
