package DataStructure.Examly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int i=1;
        StringBuffer stringBuffer= new StringBuffer();
        for(char ch: str1.toCharArray()){
            if(ch==32){
                map.put(i++, String.valueOf(stringBuffer));
                stringBuffer.delete(0, stringBuffer.length());
            }else{
                stringBuffer.append(ch);
            }
        }
        map.put(i++, String.valueOf(stringBuffer));
        stringBuffer.delete(0, stringBuffer.length());
        i=1;
        StringBuffer stringBuffer2= new StringBuffer();
        for(char ch: str2.toCharArray()){
            if(ch==32){
                map2.put(i++, String.valueOf(stringBuffer2));
                stringBuffer2.delete(0, stringBuffer2.length());
            }else{
                stringBuffer2.append(ch);
            }
        }
        map2.put(i++, String.valueOf(stringBuffer2));
        stringBuffer2.delete(0, stringBuffer2.length());


        System.out.println(map);
        System.out.println(map2);

    }
}
