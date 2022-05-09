package DataStructure.Examly;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(lcm(m, n));
    }
    public static int lcm(int n1, int n2){
        int max=Math.max(n1, n2);
        int temp=max;
        int min=Math.min(n1, n2);
        while(true){
            if(max%min==0){
                return max;
            }else{
                max+=temp;
            }
        }
    }
}
