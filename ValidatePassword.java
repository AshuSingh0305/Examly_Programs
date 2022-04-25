package DataStructure.Examly;

import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int count=4;
        int numeric=1;
        int cap=1;
        int space=0;
        int start=0;
        char strarr[]=str.toCharArray();
        if(strarr[0]>=48 && strarr[0]<=57){
            start++;
        }else{
            for(char ch:str.toCharArray()){
                if(ch>=48 && ch<=57){
                    numeric=0;
                    count--;
                }else if((ch>=65&& ch<=90) || (ch>=97 && ch<=122)){
                    count--;
                }else if(ch==32 || ch==47){
                    space++;
                    count--;
                }
                if(ch>=65&&ch<=90){
                    cap--;
                }
            }
        }
        if(count<=0 && numeric==0 && space==0 && start==0 && cap<=0){
            System.out.println("1");
        }else{
            System.out.println(0);
        }
    }
}
