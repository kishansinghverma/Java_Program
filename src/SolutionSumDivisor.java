/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kisha
 */
public class SolutionSumDivisor 
{
    static int solution(int k, int ar[])
    {
        int count=0;
        
        for(int x=0; x<ar.length; x++)
        {
            for(int y=0; y<ar.length; y++)
            {
                if(x<y)
                {
                    if((ar[y]+ar[x])%k==0)
                    {
                        count++;
                    }
                }
            }
        }
        
        
        return count;
    }
    public static void main(String args[])
    {
        int arr[]={1,3,2,6,1,2};
        int solve=solution(3,arr);
        System.out.println(solve);
    }
}
