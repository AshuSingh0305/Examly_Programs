package DataStructure.Examly;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class descendingOrderStack {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i = 0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        for (int i=0;i<n;i++){
            stack.push(array[i]);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

}
