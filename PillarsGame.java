package DataStructure.Examly;

import java.util.Scanner;

public class PillarsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int p1=sc.nextInt();
        int p2=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(p1%arr[i]==0 && p2%arr[i]==0)
                count++;
        }
        System.out.println(count);
    }
}
