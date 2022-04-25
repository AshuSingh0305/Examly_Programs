package DataStructure.Examly;

import java.util.Scanner;
import java.util.Stack;

public class greaterTaken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Integer> stack = new Stack<>();
        Stack <Integer> TempStack = new Stack<>();
        int n = sc.nextInt();
        while(n>0){
            int temp = sc.nextInt();
            TempStack.push(temp);
            n--;
        }
        while(!TempStack.isEmpty()){
            stack.push(TempStack.pop());
        }
        while(!stack.isEmpty()){
            compare(TempStack, stack);
        }
    }
    static int tempvar=0;
    static int toggle=0;
    public static void compare(Stack TempStack, Stack stack){
        int val1;
        int val2;
        if(toggle==1){
            val1=tempvar;
        }else{
            val1 = (int) stack.pop();
        }
            if(!stack.isEmpty()){
                val2 = (int) stack.peek();
                if(val1<val2){
                    System.out.println(val1+" "+ val2);
                    while(!TempStack.isEmpty()){
                        stack.push(TempStack.pop());
                        toggle=0;
                    }
                }else{
                    tempvar=val1;
                    TempStack.push(stack.pop());
                    toggle=1;
                    compare(TempStack, stack);

                }
            }else{
                System.out.println(val1+" -1");
                if(!TempStack.isEmpty()){
                    stack.push(TempStack.pop());
                    toggle=0;
                }
            }
    }
}
