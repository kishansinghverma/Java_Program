
import static java.lang.Math.abs;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) 
    {
        int[] temp=new int[10]; 
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                    temp[s[i][j]]++;
            }
        }
        int count=0;
        for(int i=1; i<100; i++)
        {
            if(temp[i%10]==0)
            {
                for(int j=0; j<10; j++)
                {
                    if(temp[j]>1)
                    {
                        count+=abs((i%10)-j);
                        temp[i%10]++;
                        temp[j]--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    return count;
    }
    public static void main(String args[])
    {
        int[][] arr={{4,9,2},{3,5,7},{8,1,5}};
        formingMagicSquare(arr);
        
    }
}