package DataStructure.Examly;
import java.util.Scanner;
public class The_Cuckoo_Sequence{
    public static int cuckooSequence(int n){
        if(n==1||n==2) {
            return n-1;
        }
        else {
            return 1*cuckooSequence(n-1) + 2*cuckooSequence(n-2) + 3*1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(cuckooSequence(n));
    }
}