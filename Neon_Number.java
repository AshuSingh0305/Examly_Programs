package DataStructure.Examly;

import java.util.Scanner;

/*Neon Number = 9
    9^2=81 => 8+1 = 9
 */
public class Neon_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=20){
            int square= (int) Math.pow(n, 2);
            int sum=0;
            while (square!=0){
                int temp=square%10;
                sum+=temp;
                square/=10;
            }
            if(sum==n){
                System.out.println(n+" :Neon Number");
            }else{
                System.out.println(n+" :Not Neon Number");
            }
        }else
            System.out.println("Invalid");

    }
}
