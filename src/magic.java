import java.util.Scanner;

public class magic 
{
    public static void main(String args[])
    {
        int sum=0;
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter Any No.: ");    
        String str = sc.next();
        while(Integer.parseInt(str)>9)
        {
            for(int i=0; i<str.length(); i++)
            {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            str=Integer.toString(sum);
            sum=0;
        }
        if(Integer.parseInt(str)==1)
        {
            System.out.println("Number Is Magic Number");
        }
        else
        {
            System.out.println("Number Is Non Magic Number");
        }
    }
      
      
}
