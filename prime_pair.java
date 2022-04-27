package DataStructure.Examly;
import java.util.Scanner;

public class prime_pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 2 ; i< n ; i++){
            for (int j = 2 ; j<n ; j++){
                if(isPrime(i)&& isPrime(j)){
                    if(i*j<=n){
                        stringBuffer.append(i+" "+j+" ");
                    }
                }
            }
        }
        System.out.println(stringBuffer);

    }

    public static boolean isPrime(int n ){
        int count=0;
        for(int i =2 ; i< n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}