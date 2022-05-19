/*Write a program that can determine whether the characters in the first string 'X'
can be rearranged to form the second string 'Y'. The output should be "yes" if this is possible and "no" if not.*/

package DataStructure.Examly;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class String_permutation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String X=sc.next();
        String Y=sc.next();
        Queue<Character> queue = new ArrayDeque<>();
        for(char ch:X.toCharArray()){
            queue.add(ch);
        }
        int tog=0;
        for (char ch: Y.toCharArray()){
            if(queue.contains(ch)){
                queue.remove(ch);
            }else{
                tog=1;
                break;
            }
        }
        if(tog==1){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }
}
