
public class Threading implements Runnable
{
    int i=4;
    @Override
    public void run()
    {
        System.out.println("Hello from "+Thread.currentThread().getName());
        if(Thread.currentThread().getName().equals("Thread-1"))
        {
            Thread.currentThread().stop();
        }
        Thread t1=new Thread(this);
        t1.setName("Thread-"+i);
        t1.start();
        i--;
    }
    public static void main(String args[])
    {
        Threading t1=new Threading();
        Thread x1=new Thread(t1);
        x1.setName("Thread-5");
        x1.start();
    }
}
