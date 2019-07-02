abstract class Demo1
{
       abstract void hello();
}
public class AbstractDemo extends Demo1
{
    void hello()
    {
        System.out.println("Running.....");
        System.out.println("Function Defined In Base Class!!");
    }
    public static void main(String args[])
    {
        AbstractDemo obj=new AbstractDemo();
        obj.hello();
    }
}

