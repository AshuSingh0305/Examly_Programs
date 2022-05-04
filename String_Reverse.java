package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char strarr[]= str.toCharArray();
        char arr[]=new char[strarr.length];
        if(str.length()==0){

        }
        for(int i=0;i< strarr.length;i++){
            if(strarr[i]>='a'&&strarr[i]<='z'){
            }else{
                arr[i]=strarr[i];
            }
        }
        int j= strarr.length-1;
        for(int i=0;i< strarr.length;i++){
            if(strarr[i]>='a'&& strarr[i]<='z'){
                if(arr[j]=='\u0000'){
                    arr[j]=strarr[i];
                    j--;
                }else{
                    while (arr[j]!='\u0000'){
                        j--;
                    }
                    arr[j]=strarr[i];
                    j--;
                }
            }
        }
        for(int i=0;i< strarr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
