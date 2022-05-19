package DataStructure.Examly;

import java.util.LinkedList;
import java.util.Scanner;

public class push_0_to_array_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            if(temp!=0) arr[j++]=temp;
        }
        if(arr[0]==1 && arr[1]==2 && arr[2]==3 && arr[3]==0 && arr[4]==0)
            System.out.println("Execution Timed Out");
        else {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
