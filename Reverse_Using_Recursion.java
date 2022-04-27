package DataStructure.Examly;

import java.util.Scanner;

public class Reverse_Using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        System.out.println(reverse(n, rev));
    }
    public static int reverse(int n, int rev){
        if(n<=0){
            return rev;
        }
        int mod=n%10;
        rev=rev*10+mod;
        n=n/10;
        return reverse(n, rev);
    }
}
