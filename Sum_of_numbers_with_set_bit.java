package DataStructure.Examly;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Sum_of_numbers_with_set_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum=0;
//        Queue<String> queue = new ArrayDeque<>();
        int i=0;
        while (true){
            int j=i;
            Stack<Integer> stack = new Stack<>();
            while(j!=0) {
                int temp = j % 2;
                stack.push(temp);
                j/=2;
            }
            int count=0;
            if(stack.size()<=n){
                while (!stack.isEmpty()){
                    if(stack.pop()==1){
                        count++;
                    }
                }
                if(count==m){
                    sum+=i;
                }
            }else{
                break;
            }
            i++;
        }
        System.out.println(sum);
    }
}
