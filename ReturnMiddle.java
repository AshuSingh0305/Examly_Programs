package DataStructure.Examly;

import java.util.LinkedList;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class ReturnMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list= new LinkedList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i=1;i<=n;i++){
            int val= (int) list.remove();
            if(n%2==0){
                if(i==n/2){
                    System.out.print(val+" ");
                    System.out.print(list.remove());
                    break;
                }
            }else{
                if(i==n/2+1){
                    System.out.print(val);
                    break;
                }

            }
        }
    }
}
