public class fabonacci 
{
    public static void main(String args[])
    {
        int  x=0, y=1, z=0;
        for(int i=0; i<10; i++)
        {
            System.out.println(x);
            z=x+y;
            x=y;
            y=z;
        }
    }
    
}
