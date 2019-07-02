class temp2
{
    int age=10;
}  
class temp extends temp2
{
    String name="Kishan";
}
public class InheritenceDemo extends temp
{
    void display()
    {
        System.out.println(name+" is "+age+" years old...");
    }
    public static void main(String args[])
    {
        InheritenceDemo obj=new InheritenceDemo();
        obj.display();
    }
}
