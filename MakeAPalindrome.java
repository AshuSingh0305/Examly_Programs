package DataStructure.Examly;

import java.util.*;
public class MakeAPalindrome {
    static boolean pallindrom(String str){
        boolean pal=false;
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String str1=String.valueOf(sb);
        if(str.equals(str1))
            pal=true;
        return pal;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String st=s.next();
        int n=st.length();
        String ans="";
        int j=n-1;
        for(int i=0;i<n-1;i++){
            String str=st.substring(i);
            if(pallindrom(str)){
                j=i;
                break;
            }
        }
        if(j!=0){
            ans+=st.substring(0,j);
            StringBuilder ans1=new StringBuilder(ans);
            ans1.reverse();
            System.out.println(ans1);
        }
        else
            System.out.println("NULL");
    }
}