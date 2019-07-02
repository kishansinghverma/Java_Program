import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SolutionBirthday {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) 
    {
        int[] sum=new int[m];
        int total;
        
        int temp=0;
        int count=0;
        while(true)
        {
            total=0;
            for(int y=0; y<sum.length; y++)
            {
                
                sum[y]=s.get(y+temp);
            }
            for(int x : sum)
            {
                total += x;
            }
            if(total==d)
            {
                count++;
            }
            temp++;
            if(temp>(s.size()-sum.length))
            {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        List<Integer> s = new ArrayList<>();

        int d = 3;
        int m = 2;
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        int result = birthday(s, d, m);

    }
}
