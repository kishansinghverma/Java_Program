class x
{
    int x=5; 
    void ab()
    {  
        System.out.println("X Running "+x);
    }
}
class y extends x
{
    int x=10;
    void ab()
    {  
        System.out.println("Y running "+x);
        super.ab();
    }
}
class z extends y
{
    int x=20;
    void ab()
    {  
        System.out.println("Z running "+x);
        System.out.println("Z running "+super.x);
    }
    void disp()
    {
        ab();
        super.ab();
    }
}
public class SuperDemo extends z
{
    public static void main(String args[])
    {
        System.out.println("Running");
        SuperDemo obj=new SuperDemo();
        obj.disp();
    }
}
