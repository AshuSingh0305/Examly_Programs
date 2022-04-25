package DataStructure.Examly;

import java.util.Scanner;

class MinimumTile {

    static int minimumTiles(int n, int m)
    {
        if (n == 0 || m == 0)
            return 0;
        else if (n % 2 == 0 && m % 2 == 0)
            return minimumTiles(n / 2, m / 2);
        else if (n % 2 == 0 && m % 2 == 1)
            return (n + minimumTiles(n / 2, m / 2));
        else if (n % 2 == 1 && m % 2 == 0)
            return (m + minimumTiles(n / 2, m / 2));
        else
            return (n + m - 1 + minimumTiles(n / 2, m / 2));
    }
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.println(minimumTiles(n, m));
    }
}
