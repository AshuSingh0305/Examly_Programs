package DataStructure.Examly;

import java.util.Scanner;

public class BestMoviePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();
        int eve=sc.nextInt();
        int night=sc.nextInt();
        int  BestMobilePlan,
        printPlanDetails;
        float A=planA(day, eve, night);
        float B=planB(day, eve, night);
        if(A<B){
            System.out.printf("Plan A is cheapest");
        }else if(B<A)
            System.out.println("Plan B is cheapest");
        else
            System.out.println("Plan A and B are the same price");
    }
    public static float planA(int d, int e, int n){
        d=d-100;
        float sum=0;
        if(d<=0)
            d=0;
        sum+=(0.25*d)+(0.15*e)+(0.20*n);
        System.out.println("Plan A costs "+String.format("%.2f",sum));
//        System.out.println();
        return sum;
    }
    public static float planB(int d, int e, int n){
        d=d-250;
        float sum=0;
        if(d<=0){
            d=0;
        }
        sum+=(0.45*d)+(0.35*e)+(0.25*n);
        System.out.println("Plan B costs "+String.format("%.2f",sum));
//        System.out.println();
        return sum;
    }
}
