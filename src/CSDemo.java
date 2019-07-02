/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kisha
 */
class text
{
    int a=0;
}
public class CSDemo extends text  implements Runnable
{
    void method1()
    {
        System.out.println("Method1 "+a);
        a=5;
    }
    void method2()
    {
        System.out.println("Method2 "+a);
        a=5;
    }
    
    public void run()
    {
        method1();
        method2();
    }
    public static void main(String args[])
    {
        CSDemo obj=new CSDemo();
        Thread t1=new Thread(obj);
        t1.start();
    }
}
