
import java.util.ArrayList;
import java.util.List;

public class MigrationSolution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) 
    {
        int[] count=new int[5];
        for(int i=1; i<=5; i++)
        {
            for(int x : arr)
            {
                if(x==i)
                {
                    count[i-1]++;
                }
            }
        }
        for(int x : count)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
        int max=0;
        for(int x=0; x<count.length; x++)
        {
            if(max<count[x])
            {
                max=count[x];
            }
        }
        System.out.println(max);
        int place=0;
        for(int x=count.length-1; x>=0; x--)
        {
            if(max==count[x])
            {
                place=x;
            }
        }
        System.out.println(place+1);
        return place+1;
    }
    public static void main(String args[])
    {
        List<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        migratoryBirds(arr);
    }
}