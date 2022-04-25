package DataStructure.Examly;

import java.util.Scanner;

public class RecreationFair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        if(m%n==0){
            System.out.println(n);
        }else{
            n=n/2;
            for(int i=n;i>0;i--){
                if(m%i==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
