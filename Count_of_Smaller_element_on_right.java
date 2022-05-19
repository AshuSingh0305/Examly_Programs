package DataStructure.Examly;

import java.util.Scanner;

public class Count_of_Smaller_element_on_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            if(i==n-1){
                break;
            }
            for (int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
            System.out.print(count+ " ");
        }
        System.out.println("0 ");
    }
}
