package DataStructure.Examly;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class DeleteOddBlocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        int j=0;
        int i=0;
        while (queue.size()!=(n-1)){
            for(i=i;i<n;i=i+2){
                queue.add(arr[i]);
                arr[i]=0;
                j++;
                if(i>=n-1){
                    i=j-2;
                    Arrays.sort(arr);
                }
                if(queue.size()==n-1){
                    break;
                }
            }
            i=j;
            Arrays.sort(arr);
        }
        System.out.print(arr[arr.length-1]);
    }
}
