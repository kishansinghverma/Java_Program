public class armstrong 
{
    public static void main(String args[])
    {
        int n1,n2,n3;
        System.out.println("ArmStrong Numbers Are:");
        for(int i=1; i<1000; i++)
        {
            n1=i/100;
            n2=(i%100)/10;
            n3=i%10;
            if(((n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3)) == i)
            {
                System.out.println(i);
            }
        }
    }
    
}
