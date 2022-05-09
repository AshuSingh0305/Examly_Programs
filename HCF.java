package DataStructure.Examly;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int i=2;
        int hcf = 1;
        while (i<=arr[0]){
            boolean tog = true;
            for(int j = 0 ; j<n ; j++){
                if(arr[j]%i!=0){
                    tog = false;
                    break;
                }
            }
            if(tog){
                for(int j =0 ; j<n ; j++){
                    arr[j]/=i;
                }
                hcf*=i;
            }
            if(!tog){
                i++;
            }
        }
        System.out.println(hcf);
    }
}