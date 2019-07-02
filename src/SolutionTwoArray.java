import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class SolutionTwoArray {

    static ArrayList<Integer> lst=new ArrayList<Integer>();
    static ArrayList<Integer> fnl=new ArrayList<Integer>();
    
    static int getTotalX(int[] a, int[] b) 
    {    
        int i=2;
        int factor=1;
        int check=0;
        
        while(true)
        {
            check=0;
            for(int x=0; x<a.length; x++)
            {
                if(a[x]%i == 0)
                {
                    a[x]=a[x]/i;
                    check=1;
                }
            }
            if(check==1)
            {
                factor=factor*i;
            }
            else
            {
                i++;
            }
            int y=1;
            for(int x : a)
            {
                y=y*x;
            }
            if(y==1)
            {
                break;
            }
        }
        System.out.println(factor);
        
        i=1;
        int p=factor;
        while(factor <= b[0])
        {
            i++;
            lst.add(factor);
            factor=p*i;
        }
        
        for(int x : lst)
        {
            int flag=0;
            for(int y : b)
            {
                if(y%x != 0)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                fnl.add(x);
            }
        }
        
        System.out.println("List");
        for(int x : fnl)
        {
            System.out.println(x);
        }
        
        return fnl.size();
    }

    public static void main(String[] args) throws IOException 
    {
        int[] a={10,10};
        int[] b={36,72};
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
