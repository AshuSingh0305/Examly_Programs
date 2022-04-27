package DataStructure.Examly;

import java.util.Scanner;

public class Wild_Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        int count=0;
        for(int i=0;i<str1.length();i++){
            if(arr1[i]==arr2[i]||arr1[i]=='?'||arr2[i]=='?'){
                count++;
            }else{
                count--;
            }
        }
        if (count==str1.length()){
            System.out.println("Yes");
        }else
            System.out.println("No");

    }
}
