package DataStructure.Examly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String str=sc.next();
            map.put(str, 1);
        }
        System.out.println(map.size());
    }
}
