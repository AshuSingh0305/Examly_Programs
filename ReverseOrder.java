package DataStructure.Examly;

import java.util.Scanner;
import java.util.Stack;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String str = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        for(char ch: str.toCharArray()){
            if(ch==32){
                stack.push(String.valueOf(stringBuffer));
                stringBuffer.delete(0, stringBuffer.length());
            }else{
                stringBuffer.append(ch);
            }
        }
        stack.push(String.valueOf(stringBuffer));
        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
