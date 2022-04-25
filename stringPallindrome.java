package DataStructure.Examly;

import java.util.Scanner;
import java.util.Stack;

public class stringPallindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sc.nextLine();
        int length = str.length()/2;
        int i=0;
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
        char mid = 0;

        if(str.length()%2==0){
            while(i<length){
                leftStack.push(str.charAt(i));
                i++;
            }
            while(i<str.length()){
                rightStack.push(str.charAt(i));
            }
        }else{
            while(i<length){
                leftStack.push(str.charAt(i));
                i++;
            }
            mid = str.charAt(i);
            i++;
            while(i<str.length()){
                rightStack.push(str.charAt(i));
                i++;
            }
        }
        StringBuffer reverse = new StringBuffer();
        if(str.length()%2==0){
            while(!rightStack.isEmpty()){
                reverse.append(rightStack.pop());
            }while (!leftStack.isEmpty()){
                reverse.append(leftStack.pop());
            }
        }else{
            while(!rightStack.isEmpty()){
                reverse.append(rightStack.pop());
            }
            reverse.append(mid);
            while (!leftStack.isEmpty()){
                reverse.append(leftStack.pop());
            }
        }
        if(str.equals(reverse.toString())){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not a palindrome");
        }
    }
}
