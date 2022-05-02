package DataStructure.Examly;

import java.util.Scanner;

public class Choosing_Movie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int li[]=new int[n];
        int ri[]=new int[n];
        for(int i=0;i<n;i++){
            li[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            ri[i]=sc.nextInt();
        }
        int result[]=new int[n];
        for (int i=0;i<n;i++){
            result[i]=li[i]*ri[i];
        }
        int max=0, i=0;
        max=max(result, max, i=0);
        int count=0;
        int ind[]=new int[n];
        for(int a=0;a<n;a++){
            if(result[a]==max){
                ind[a]=max;
                count++;
            }
        }

        if(count>1){

        }else{

        }
    }
    public static int max(int[] result, int max, int i){
        if(i==result.length-1){
            return max;
        }else {
            max=Math.max(result[i], result[i+1]);
            max(result, max, i+1);
        }
        return max;
    }
}
