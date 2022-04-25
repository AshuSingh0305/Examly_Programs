package DataStructure.Examly;

import java.util.Scanner;

public class ConsonentOrVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch=sc.next();
        for(char str: ch.toCharArray()){
            if(str=='a' ||str=='e' ||str=='i' ||str=='o' ||str=='u' ||str=='A' ||str=='E' ||str=='I' ||str=='O' ||str=='U')
                System.out.println(ch+" :vowel");
            else
                System.out.println(ch+" :consonent");
        }
    }
}
