package DataStructure.Examly;
import java.util.Scanner;

public class Divisbility_Product_Sum_of_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0 ; i<n ; i++){
            int sum=0;
            int pro = 1;
            int val = arr[i];
            while (val>0){
                int mod = val%10;
                if(mod!=0) {
                    sum += mod;
                    pro *= mod;
                }
                val/=10;
            }
            val=arr[i];
            if(val%sum==0 || val%pro==0){
                count++;
            }
        }
        System.out.println(count);
    }
}