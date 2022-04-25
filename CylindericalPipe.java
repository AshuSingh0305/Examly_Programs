package DataStructure.Examly;

import java.util.Scanner;
import java.util.Stack;

public class CylindericalPipe {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        int[]minarr = new int[3];
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        while (c1 != 0) {
            minarr[0]+= tempStack.push(sc.nextInt());
            c1--;
        }
        while(!tempStack.isEmpty()){
            stack1.push(tempStack.pop());
        }
        while (c2 != 0) {
            minarr[1]+= tempStack.push(sc.nextInt());
            c2--;
        }
        while(!tempStack.isEmpty()){
            stack2.push(tempStack.pop());
        }
        while (c3 != 0) {
            minarr[2]+= tempStack.push(sc.nextInt());
            c3--;
        }
        while(!tempStack.isEmpty()){
            stack3.push(tempStack.pop());
        }
        minimumarr(minarr, stack1, stack2, stack3);
    }
    private static void minimumarr(int []minarr, Stack stack1, Stack stack2, Stack stack3){
        int min=100000;
        for(int i=0;i<3;i++){
            if(minarr[i]<min){
                min=minarr[i];
            }
        }
        if(minarr[0]==minarr[1]&&minarr[1]==minarr[2]){
            System.out.println(min);
        }else{
            minimum(minarr, stack1, stack2, stack3, min);
        }

    }
    private static void minimum(int []minarr, Stack stack1, Stack stack2, Stack stack3, int min){
        for(int i=0;i<3;i++){
            if(minarr[i]>min) {
                int valpop;
                if (i == 0) {
                    valpop = (int) stack1.pop();
                } else if (i == 1) {
                    valpop = (int) stack2.pop();
                } else {
                    valpop = (int) stack3.pop();
                }
                minarr[i] -= valpop;
            }
        }
        minimumarr(minarr, stack1, stack2, stack3);
    }
}