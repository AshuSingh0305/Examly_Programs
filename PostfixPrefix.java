package DataStructure.Examly;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PostfixPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str+=")";
        Postgen postgen = new Postgen();
        postgen.prefix(str);
    }
}
class Postgen{
    private final List<Character> leftBrackets = Arrays.asList('(','[','{','<');
    private final List<Character> rightBrackets = Arrays.asList(')',']','}','>');
    private final List<Character> opr = Arrays.asList('+','-','*','/','^','%');
    public void prefix(String str){

        Stack<Character> bracket = new Stack<>();
        Stack<Character> operation = new Stack<>();
        Stack<Character> variable = new Stack<>();
        Stack<Character> variablefinal = new Stack<>();

        bracket.push('(');

//        int leftcount = 1;
        for(char ch: str.toCharArray()){
            if(isLeftBracket(ch)){
                bracket.push(ch);
//                leftcount=0;
            }
            if((ch>='a'&&ch<='z') || (ch>='A' && ch<='Z')){
                variable.push(ch);
            }
            if(isOpr(ch)){
                if(!operation.isEmpty()){
                    if(bracket.peek()=='('){
                        operation.push(ch);
                        bracket.push(ch);
                    }else{
                        if(operation.peek()=='^'){
                            variable.push(operation.pop());
                            operation.push(ch);
                            bracket.push(ch);
                        }else if(operation.peek()=='/'|| operation.peek()=='*'){
                            if(ch=='^') {
                                operation.push(ch);
                                bracket.push(ch);
//                            leftcount++;
                            }else{
                                variable.push(operation.pop());
                                operation.push(ch);
                            }
                        }
                        else if(operation.peek()=='+' || operation.peek()=='-') {
                            if(ch=='*'||ch=='/'||ch=='^'){
                                operation.push(ch);
                                bracket.push(ch);
                            }else {
                                variable.push(operation.pop());
                                operation.push(ch);
                            }
                        }
                    }
                }
                else{
                    operation.push(ch);
                    bracket.push(ch);
//                leftcount++;
                }
            }
            if(isRightBracket(ch)){
                while(bracket.pop()!='('){
                    variable.push(operation.pop());
                }
            }
        }
        if(!operation.isEmpty()){
            variable.push(operation.pop());
        }
        while(!variable.isEmpty()){
            variablefinal.push(variable.pop());
        }
        while ((!variablefinal.isEmpty())){
            System.out.print(variablefinal.pop());
        }
    }
    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }
    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isOpr(char ch) { return opr.contains(ch); }

}

