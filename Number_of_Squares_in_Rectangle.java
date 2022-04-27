package DataStructure.Examly;

import java.util.Scanner;

public class Number_of_Squares_in_Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        calcSquare(n, m, sum);
    }
    public static void calcSquare(int n, int m, int sum){
        if(n==1||m==1){
            sum+=n*m;
            System.out.println(sum);
            return;
        }else{
            sum+=n*m;
            calcSquare(n-1, m-1, sum);
        }

    }
}
