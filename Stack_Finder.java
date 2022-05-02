package DataStructure.Examly;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Finder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        int find=sc.nextInt();
        System.out.println(stack.pop());
        int popped =stack.pop();
        int count=1;
        int tog=0;
        System.out.println("Top Element : "+popped);
        if(popped==find){
            System.out.println("Element is found at position : "+count);
        }else {
            while (!stack.isEmpty()){
                popped=stack.pop();
                count++;
                if(popped==find){
                    System.out.println("Element is found at position : "+count);
                    tog=1;
                    break;
                }
            }
            if (tog==0){
                System.out.println("Element not found");
            }
        }
    }
}
