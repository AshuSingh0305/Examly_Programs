package DataStructure.Examly;
import java.util.Scanner;

public class Divisibility_by_Eleven_Contagious_integer_fragments {
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int init=0;
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0 ; i< str.length() ; i++){
            for(int j =i ;init<str.length() ; j++){
                if(j== init){
                    stringBuffer.append(str.charAt(j));
                    checkDivisibility(stringBuffer.toString());
                    init++;
                    j=i-1;
                    stringBuffer.delete(0 , stringBuffer.length());
                }else {
                    stringBuffer.append(str.charAt(j));
                }
            }
            init=i+1;
        }
        System.out.println(count);
    }

    public static void checkDivisibility(String str){
        int val = Integer.parseInt(str);
        if(val%11==0)
            count++;
    }
}