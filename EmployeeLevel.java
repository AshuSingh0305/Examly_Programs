package DataStructure.Examly;

import java.util.Scanner;

public class EmployeeLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float s = sc.nextFloat();
        if(s>100){
            System.out.println(n);
            System.out.println(s);
            System.out.println("1");
        }else{
            System.out.println(n);
            System.out.println(s);
            System.out.println("2");
        }
    }
}
