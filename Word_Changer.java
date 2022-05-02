package DataStructure.Examly;

import java.util.Scanner;

public class Word_Changer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer();
        for(char ch: str.toCharArray()){
            if(ch>='a' && ch<='z'){

                int a =(int) ch;
                a+=1;
                ch=(char) a;
                if(ch=='{'){
                    ch='a';
                }
                stringBuffer.append(ch);
            }else if(ch=='"'){

            }
            else{
                stringBuffer.append(ch);
            }
        }
        System.out.println(stringBuffer);
    }
}
