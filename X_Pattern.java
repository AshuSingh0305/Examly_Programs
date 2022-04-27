package DataStructure.Examly;

import java.util.Scanner;

public class X_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int ind=n*2-1;
        for(int i=1;i<n*2;i++){
            for(int j=1;j<=ind;j++){
                if(j==a||j==ind){
                    System.out.print(a+ " ");
                }else{
                    System.out.print("  ");
                }
            }
            if(i>=n) {
                a--;
                ind++;
            }
            else {
                a++;
                ind--;
            }
            System.out.println();
        }
    }
}
