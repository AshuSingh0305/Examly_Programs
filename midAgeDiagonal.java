package DataStructure.Examly;

import java.util.Scanner;

public class midAgeDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0;
        int j=0;
        int count=0;
        while (n!=0){
            if(arr[i][j]>18 && arr[i][j]<60){
                count++;
            }
            i++;j++;
            n--;
        }
        System.out.println(count);
    }
}
