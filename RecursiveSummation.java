package DataStructure.Examly;

import java.util.Scanner;

public class RecursiveSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if (m <= 0) {
            n=summation(n,1);
        }else {
            for (int i = m; i > 0; i--) {
                n = summation(n, i);
            }
        }
        System.out.print(n);

    }
    public static int summation(int n, int m){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
