
public class Demo 
{
    static int[] array={10,11,12,13,14};
    static void print()
    {
        for(int x:array)
        {
            System.out.println(x);
            if(x==11)
            {
                break;
            }
        }
    }
    public static void main(String args[])
    {
        print();
    }
}
