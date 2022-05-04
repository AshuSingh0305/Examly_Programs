package DataStructure.Examly;
import java.util.LinkedList;
import java.util.Scanner;

public class Delete_smaller_nodes_in_a_linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            list1.addLast(sc.nextInt());
        }
        while (!list1.isEmpty()){
            int top = list1.remove();
            if(!list1.isEmpty()) {
                int peek = list1.peek();
                if (peek < top) {
                    list2.addLast(top);
                }
            }

        }
        while (!list2.isEmpty()){
            int val = list2.removeFirst();
            if(list2.isEmpty()){
                System.out.print(val);
            }else{
                System.out.print(val+" -> ");
            }
        }
    }
}