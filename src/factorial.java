import java.util.Scanner;

public class factorial 
{
    public static void main(String args[])
    {
        int fact=1;
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter No. For Factorial: ");    
        int n = Integer.parseInt(sc.next());   
        for(int i=1; i<=n; i++)
        {
            fact *= i;
        }
        System.out.println("The Factorial For Given No.: "+fact);
    }
    
}
