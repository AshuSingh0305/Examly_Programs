package DataStructure.Examly;

import java.util.Scanner;

public class Count_occurrences_of_a_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();
        int total=0;
        for(int i=n; i<=m; i++){
            int count=0;
            count= function(i, count, l);
            total+=count;
        }
        System.out.println(total);
    }
    public static int function(int i, int count, int l){
        while (i!=0){
            int temp=i%10;
            if(temp==l){
                count++;
            }
            i/=10;
        }
        return count;
    }
}
