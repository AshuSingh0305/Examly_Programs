package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;

public class Display_items_which_do_not_change_position {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            int temp=sc.nextInt();
            arr[i]=temp;
            arr2[i]=temp;
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr2[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
