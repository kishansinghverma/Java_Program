/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kisha
 */
public class SolutionMaxRecord 
{
    static int[] breakingRecords(int[] scores) 
    {
        int lowest=scores[0];
        int highest=scores[0];
        
        int counth=0;
        int countl=0;
        
        for(int x : scores)
        {
            if(x<lowest)
            {
                lowest=x;
                countl++;
            }
            if(x>highest)
            {
                highest=x;
                counth++;
            }
        }
        int[] score={counth, countl};
        return score;
    }
    public static void main(String args[])
    {
        int[] arr={3,4,21,36,10,28,35,2,5,24,42};
        breakingRecords(arr);
    }
}