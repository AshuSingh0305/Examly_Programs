package DataStructure.Examly;

import java.util.LinkedList;
import java.util.Scanner;

public class FindHall {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        String str = sc.next();
        boolean val = list.contains(str);
        if(val){
            System.out.println(list.indexOf(str));
        }else{
            System.out.println(str+" hall is not found");
        }
    }
}
