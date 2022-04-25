package DataStructure.Examly;

import java.util.Scanner;

public class sumCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n=sc.nextLine();
        int arr[]=new int[n.length()];
        int i=n.length()-1;
        for (char ch: n.toCharArray()) {
            arr[i--] = Character.getNumericValue(ch);
        }
        int sum=0;
        for(int j=0;j<arr.length-1;j++){
            for(int a= j+1;a<arr.length;a++){
                sum+=arr[a]+arr[j];
            }
        }
        System.out.println(sum);
    }
}
