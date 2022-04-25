package DataStructure.Examly;

import java.lang.reflect.Array;
import java.util.Scanner;

public class FindKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1=sc.next();
        String n2=sc.next();
        String n3=sc.next();
        int a1[]=new int[4];
        int a2[]=new int[4];
        int a3[]=new int[4];
        int i=0;
        for(char ch: n1.toCharArray()){
            a1[i++]=Character.getNumericValue(ch);
        }
        i=0;
        for(char ch: n2.toCharArray()){
            a2[i++]=Character.getNumericValue(ch);
        }
        i=0;
        for(char ch: n3.toCharArray()){
            a3[i++]=Character.getNumericValue(ch);
        }
        int arr[]=new int[4];
        for(i=0;i<4;i++){
            if(i%2==0) {
                int val = smallest(a1[i], a2[i], a3[i]);
                arr[i]=val;
            }else {
                int val = largest(a1[i], a2[i], a3[i]);
                arr[i]=val;
            }
        }
        for(i=0;i<4;i++){
            System.out.print(arr[i]);
        }
    }
    public static int smallest(int x, int y, int z){
        if(x<y&&x<z){
            return x;
        }else if(y<x&&y<z){
            return y;
        }else{
            return z;
        }
    }
    public static int largest(int x, int y, int z){
        if(x>y&&x>z){
            return x;
        }else if(y>x&&y>z){
            return y;
        }else{
            return z;
        }
    }
}
