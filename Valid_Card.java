package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;

public class Valid_Card {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        char strarr[]=str.toCharArray();
        if(str.length()>=14 && str.length()<=16){
            if(strarr[0]=='4'||strarr[0]=='5'||strarr[0]=='6'){
                valid(strarr, str);
            } else if (strarr[0]=='3' && strarr[1]=='7') {
                valid(strarr, str);
            }else{
                System.out.println(str+" is invalid");
            }
        }else{
            System.out.println(str+" is invalid");
        }

    }
    public static void valid(char arr[], String str){
        int sum=0;
        for(int i=arr.length-2;i>=0;i=i-2) {
            int val = Character.getNumericValue(arr[i]);
            val = val * 2;
            if (val > 9) {
                val = val % 10;
                val = val + 1;
            }
            sum+=val;
        }
        for(int i= arr.length-1;i>=0;i=i-2){
            sum+=Character.getNumericValue(arr[i]);
        }
        if(sum%10==0){
            System.out.println(str+" is valid");
        }else{
            System.out.println(str+ " is invalid");
        }
    }
}
