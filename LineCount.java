package DataStructure.Examly;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LineCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new ArrayDeque<>();
        while(true){
            String str=sc.nextLine();
            if(str.equals("q"))
                break;
            else
                queue.add(str);
        }
        System.out.println(queue.size());
    }
}
