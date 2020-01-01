
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Attendee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l1[]=new int[n];
        int l2[]=new int[n];
        int l3[]=new int[n];

        for(int i=0; i<n; i++)
            l1[i]=sc.nextInt();
        for(int i=0; i<n; i++)
            l2[i]=sc.nextInt();
        for(int i=0; i<n; i++)
            l3[i]=sc.nextInt();

        int r=sc.nextInt();
        Set<Integer> s1=new HashSet<>();
        for(int i=0; i<r; i++){
            int a1=sc.nextInt();
            int a2=sc.nextInt();
            int b1=sc.nextInt();
            int b2=sc.nextInt();
            int c1=sc.nextInt();
            int c2=sc.nextInt();

            for(int j=a1-1; j<a2; j++){
                s1.add(l1[j]);
            }
            for(int j=b1-1; j<b2; j++){
                s1.add(l2[j]);
            }
            for(int j=c1-1; j<c2; j++){
                s1.add(l3[j]);
            }
            System.out.print(s1.size());
        }
    }
}
