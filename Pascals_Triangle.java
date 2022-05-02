package DataStructure.Examly;

import java.util.Scanner;

public class Pascals_Triangle {
    public int factorial(int i){
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i, j;
        n-=1;
        Pascals_Triangle g = new Pascals_Triangle();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
            }
            for (j = 0; j <= i; j++) {
                System.out.print(g.factorial(i) / (g.factorial(i - j)* g.factorial(j))+" ");
            }
            System.out.println();
        }
    }
}
