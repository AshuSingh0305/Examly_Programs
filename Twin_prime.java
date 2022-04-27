package DataStructure.Examly;

import java.util.Scanner;

public class Twin_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(isPrime(n) && isPrime(m)){
            if(n+2 == m || m+2==n){
                System.out.println(n+" and "+m+" are Twin Prime Numbers");
            }else{
                System.out.println(n+" and "+m+" are not Twin Prime Numbers");
            }
        }else{
            System.out.println(n+" and "+m+" are not Twin Prime Numbers");
        }
    }
    public static boolean isPrime(int n ){
        int count=0;
        for(int i =2 ; i< n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}