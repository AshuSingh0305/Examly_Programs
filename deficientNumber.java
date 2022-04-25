package DataStructure.Examly;

import java.util.Scanner;

public class deficientNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numberType = sc.nextInt();
        int n = numberType;
        findType(n);
    }
    public static void findType(int n){
        int sum =1;
        for(int i =1 ; i< n ; i++){
            if(n%i==0)
                sum+=i;
        }
        if(sum==n){
            System.out.println("is a perfect number");
        }else if(sum<n){
            System.out.println(n+" is a deficient number");
        }else{
            System.out.println(n+" is a abundant number");
        }
    }
}
