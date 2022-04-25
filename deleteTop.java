package DataStructure.Examly;

import java.util.Scanner;
import java.util.Stack;

public class deleteTop {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<n;i++){
            stack.push(sc.nextInt());
        }
        int pop = stack.pop();
        System.out.println("Deleted element is " + pop + "\nThe elements in stack");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
