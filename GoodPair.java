package DataStructure.Examly;

import java.util.Scanner;

public class GoodPair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        int arr1[]=new int[8];
        int arr2[]=new int[8];
        int i=0;
        for(char ch: str1.toCharArray()){
            arr1[i++]=Character.getNumericValue(ch);
        }
        i=0;
        for(char ch: str2.toCharArray()){
            arr2[i++]=Character.getNumericValue(ch);
        }
        int count=0;
        for(i=0;i<8;i++){
            if(arr1[i]!=arr2[i]){
                count++;
            }
        }
        int ans=(count*100)/8;
        System.out.println(ans);
    }
}
