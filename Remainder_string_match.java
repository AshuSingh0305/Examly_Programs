package DataStructure.Examly;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Remainder_string_match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String str1 = sc.next();
        String str2 = sc.next();
        Queue<Character> queue1 = new ArrayDeque<>();
        Queue<Character> queue2 = new ArrayDeque<>();
        for(char ch : str1.toCharArray()){
            if(n>=0){
                n--;
            }else{
                queue1.add(ch);
            }
        }
        for(char ch : str2.toCharArray()){
            if(m>=0){
                m--;
            }else{
                queue2.add(ch);
            }
        }
        int count=0;
        if(queue1.isEmpty() && queue2.isEmpty()){
            System.out.println("0");
        } else if (queue1.isEmpty() || queue2.isEmpty()) {
            System.out.println("-1");
        }else if(queue1.size() != queue2.size()){
            System.out.println("-1");
        }else{
            int tog=0;
            while (!queue1.isEmpty()) {
                if (queue1.remove() == queue2.remove()) {
                    count++;
                }else {
                    System.out.println("-1");
                    tog=1;
                    break;
                }
            }
            if(tog==0){
                System.out.println(count+1);
            }
        }
    }
}
