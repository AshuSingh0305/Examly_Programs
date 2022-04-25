package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_LCM_of_given_pairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            largest[i]=lcm(arr[i], arr[i+1]);
        }
        Arrays.sort(largest);
        System.out.println(largest[largest.length-1]);
    }
    public static int lcm(int n1, int n2){
        int max=Math.max(n1, n2);
        int temp=max;
        int min=Math.min(n1, n2);
        while(true){
            if(max%min==0){
                break;
            }else{
                max+=temp;
            }
        }
        return max;
    }
}
