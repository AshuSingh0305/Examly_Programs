package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;

public class coding_marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int count=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for (int i=n-1;i>n-count-1;i--){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
