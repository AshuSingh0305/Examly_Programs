package DataStructure.Examly;

import java.util.Scanner;
import java.util.Stack;

public class Binary_Longest_Sequence_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while(n!=0){
            int temp=n%2;
            n/=2;
            stack.push(temp);
        }
        int max=0;
        int longest=0;
        System.out.print("Binary number:");
        while (!stack.isEmpty()){
            int temp=stack.pop();
            System.out.print(temp);
            if(temp==0){
                longest++;
                if(max<longest){
                    max=longest;
                }
            }else {
                longest=0;
            }
        }
        System.out.println();
        System.out.println("Longest sequence of 0s:"+max);
    }
}
