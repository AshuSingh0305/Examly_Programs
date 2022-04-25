package DataStructure.Examly;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class infixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer String = new StringBuffer(str);
        String.reverse();
        String.append('(');
        Prefixgen prefixgen = new Prefixgen();
        prefixgen.prefix(String.toString());
    }
}

class Prefixgen{
    private final List<Character> leftBrackets = Arrays.asList('(','[','{');
    private final List<Character> rightBrackets = Arrays.asList(')',']','}');
    private final List<Character> opr = Arrays.asList('+','-','*','/','^','%');
    public void prefix(String str){
        Stack <Character> variable = new Stack<>();
        Stack<Character> operation = new Stack<>();
        Stack<Character> variablefinal = new Stack<>();
        operation.push(')');
        for(char ch: str.toCharArray()){
            if(isRightBracket(ch)){
                operation.push(ch);
            }else if(isOpr(ch)){
                if(!operation.empty()){
                    if (operation.peek()==')'){
                        operation.push(ch);
                    }else{
                        if(ch=='^'){
                            operation.push(ch);
                        }else if(ch=='/' || ch=='*'){
                            if(operation.peek()=='^'){
                                while(operation.peek()!='/'||operation.peek()!='*'||operation.peek()!=')'){
                                    variable.push(operation.pop());
                                    if(operation.peek()=='/'||operation.peek()=='*'||operation.peek()==')'){
                                        break;
                                    }
                                }if(operation.peek()==')'){
                                    operation.pop();
                                    if(operation.isEmpty()){
                                        operation.push(')');
                                    }
                                }
                                operation.push(ch);
                            }else{
                                operation.push(ch);
                            }
                        }else if(ch=='+' || ch=='-'){
                            if (operation.peek()=='/'||operation.peek()=='*'||operation.peek()=='^'){
                                while ((operation.peek()!='+'||operation.peek()!='-'||operation.peek()!=')')){
                                    variable.push(operation.pop());
                                    if(operation.peek()=='+'||operation.peek()=='-'||operation.peek()==')'){
                                        break;
                                    }
                                }if(operation.peek()==')'){
                                    operation.pop();
                                    if(operation.isEmpty()){
                                        operation.push(')');
                                    }
                                }
                                operation.push(ch);
                            }else{
                                operation.push(ch);
                            }

                        }
                    }
                }
            }else if(isLeftBracket(ch)){
                while (!bracketMatch(ch,operation.peek())){
                    variable.push(operation.pop());
                    if(operation.isEmpty()){
                        break;
                    }
                }
                if(operation.peek()==')'){
                    operation.pop();
                }
            }else if(ch >='A' && ch<='z' && ch!='^' || ch>=48 && ch<= 56 ){
                variable.push(ch);
            }
        }
        while(!operation.isEmpty()){
            variable.push(operation.pop());
        }
        if(variable.peek()==')'){
            variable.pop();
        }
        while(!variable.isEmpty()){
            System.out.print(variable.pop());
        }
    }
    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }
    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isOpr(char ch) { return opr.contains(ch); }
    private boolean bracketMatch(char top, char ch){
        return (leftBrackets.indexOf(top) == rightBrackets.indexOf(ch));
    }
}

