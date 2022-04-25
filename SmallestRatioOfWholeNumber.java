package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestRatioOfWholeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int count=1;
        for(int i=2;i<arr[i];i++){
            for(int j=0;j<n;j++){
                if(arr[j]%i==0){
                    count=0;
                }else{
                    count=1;
                    break;
                }
            }
            if(count==0){
                for(int j=0;j<n;j++){
                    arr[j]=arr[j]/i;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
