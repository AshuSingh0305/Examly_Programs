package DataStructure.Examly;

import java.util.Scanner;

public class Array_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int temp=arr[i];
            if(temp>0) {
                int fact = 1;
                System.out.println(factorial(temp, fact));
            }
            else if(temp<0)
                System.out.println("java.lang.IllegalArgumentException: Value must be greater than zero");
            else
                System.out.println("java.lang.ArithmeticException: An overflow has occured");
        }
    }
    public static int factorial(int temp, int fact){
        fact*=temp;
        temp--;
        if(temp>1){
            factorial(temp, fact);
        }
        return fact;
    }
}
