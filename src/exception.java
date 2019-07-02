import java.io.*;

public class exception
{
    static  void method()  throws IOException
    {
            throw new IOException("Custom Exception Here");
    }
}
class handler extends exception
{
	static void handler()
	{
		try
		{
			method();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
class test1 extends handler
{
    public static void main(String args[])
    {
        System.out.println("Program Running!!");
        handler();
        System.out.println("Flow Continued!!");
    }
}
                
    

