package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_sequence_Integers_in_an_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int fibonacci[]=new int[50];
        fibonacci[0]=0;
        fibonacci[1]=1;
        fibonacci[2]=1;
        for(int i=3;i<50;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<50;j++) {
                if (arr[i] == fibonacci[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

}
