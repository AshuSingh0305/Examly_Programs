package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;

public class Random_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
            arr2[i]=temp;
        }
        Arrays.sort(arr);
        for (int i =0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i =0;i<n;i++){
            System.out.print(arr2[i]);
        }
    }
}
