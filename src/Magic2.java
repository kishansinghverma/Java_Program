import java.util.Scanner;

public class Magic2 
{
    void magic(int num)
    {
        int sum=0;
        do
        {
            sum=0;
            while(num!=0)
            {
                int r=num%10;
                sum += r;
                num /= 10;
            }
            num=sum;
            
        }
        while(sum>9);
        
        if(sum == 1)
        {
            System.out.println("Magic Number!!");
        }
        else
        {
            System.out.println("Not A Magic Number!!");
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter a Number:");
        int num=new Scanner(System.in).nextInt();
        Magic2 obj=new Magic2();
        obj.magic(num);
    }
}
