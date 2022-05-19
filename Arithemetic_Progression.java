package DataStructure.Examly;

import java.util.Scanner;

public class Arithemetic_Progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int n = sc.nextInt();
        int ans = (a2-(a3-a2))+(n-1)*(a3-a2);
        System.out.println(ans);
    }
}
