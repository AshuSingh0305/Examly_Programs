package DataStructure.Examly;

import java.util.Scanner;

public class Number_of_Solutions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int a=1,b=0;
        for(int i=a;i<n/2+1;i++){
            for(int j=b;j<n/2+1;j++){
                if(Math.pow(i, 3)+Math.pow(j, 3)==n){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
