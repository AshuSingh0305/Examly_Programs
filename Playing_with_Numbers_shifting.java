package DataStructure.Examly;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Playing_with_Numbers_shifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            queue.add(sc.nextInt());
        }
        int s= sc.nextInt();
        while (s!=0){
            int temp=queue.remove();
            queue.add(temp);
            s--;
        }
        while (!queue.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
