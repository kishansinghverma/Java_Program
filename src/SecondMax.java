/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kishan Verma
 */
public class SecondMax {
    
    static int[] arr={1,3,2,5,6};
    
    public static void main(String args[])
    {
        int min1=arr[0], min2=arr[1];
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min1)
            {
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]<min2)
            {
                min2=arr[i];
            }
        }
        System.out.println(min1+" "+min2);
    }
    
}
