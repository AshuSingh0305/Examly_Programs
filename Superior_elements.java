package DataStructure.Examly;

import java.util.Scanner;

public class Superior_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
        for(int i=0;i<n;i++){
            int tog=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    tog=1;
                }else {
                    tog = 0;
                    break;
                }
            }
            if(tog==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
