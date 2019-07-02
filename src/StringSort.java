
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kishan Verma
 */
public class StringSort {
    
    public static void main(String args[])
    {
        String str[]=new String[5];
        str[0]="hello";
        str[1]="hi";
        str[2]="hello";
        str[3]="kishan";
        str[4]="amit";
        
        for (String x: str)
            System.out.println(x);
        
        Arrays.sort(str);
                
        System.out.println("");
        
        for (String x: str)
            System.out.println(x);       
    }
    
}
