package DataStructure.Examly;

import java.util.LinkedList;
import java.util.Scanner;

public class Random_program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[7];
        int j=6;
        for(int i=0;i<7;i++){
            if(i<3){
                arr[i]=sc.nextInt();
            }else{
                arr[j--]=sc.nextInt();
            }
        }
        for (int i = 0;i<7;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
