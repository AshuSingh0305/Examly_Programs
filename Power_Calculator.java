package DataStructure.Examly;

import java.util.Scanner;

public class Power_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        if(n<0||p<0)
            System.out.println("java.lang.Exception: n and p should be non-negative");
        else if(n<=0&&p<=0)
            System.out.println("java.lang.Exception: Both n and p should not be zero");
        else{
            float ans=(float) Math.pow(n, p);
            System.out.format("%.0f", ans);
        }
    }
}
