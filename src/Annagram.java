import java.util.Scanner;
public class Annagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        int cnt1[]=new int[26];
        int cnt2[]=new int[26];

        for(int i=0; i<str[0].length(); i++){
            cnt1[((int)str[0].charAt(i))-97]++;
        }
        for(int i=0; i<str[1].length(); i++){
            cnt2[((int)str[1].charAt(i))-97]++;
        }

        boolean flag=true;

        for(int i=0; i<cnt2.length; i++){
            if(cnt2[i]>cnt1[i]){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}