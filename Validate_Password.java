package DataStructure.Examly;

import java.util.Scanner;

public class Validate_Password {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String reg=sc.next();
        String mob=sc.next();
        int toggle=0;
        int toggle2=0;
        if(reg.length()==9 && mob.length()==10){
            char regarr[]=reg.toCharArray();
            for(int i=0;i< regarr.length;i++){
                if(i<2){
                    if(regarr[i]>=48 && regarr[i]<=57){
                        toggle=0;
                    }else{
                        toggle=1;
                        System.out.println("Invalid");
                        System.out.println("java.util.NoSuchElementException: Registration Number cannot contain any character other than digits and alphabets in format specified");
                        break;
                    }
                }else if(i>=2 && i<5){
                    if((regarr[i]>='A' && regarr[i]<='Z')||(regarr[i]>='a' && regarr[i]<='z')){
                        toggle=0;
                    }else{
                        System.out.println("Invalid");
                        System.out.println("java.util.NoSuchElementException: Registration Number cannot contain any character other than digits and alphabets in format specified");
                        toggle=1;
                        break;
                    }
                }else{
                    if(regarr[i]>=48 && regarr[i]<=57){
                        toggle=0;
                    }else{
                        System.out.println("Invalid");
                        System.out.println("java.util.NoSuchElementException: Registration Number cannot contain any character other than digits and alphabets in format specified");
                        toggle=1;
                        break;
                    }
                }
            }
            char mobarr[]=mob.toCharArray();
            for(int i=0;i< mobarr.length;i++){
                if(mobarr[i]>=48 && mobarr[i]<=57){
                    toggle2=0;
                }else{
                    toggle2=1;
                    System.out.println("Invalid");
                    System.out.println("java.lang.NumberFormatException: Mobile Number cannot contain any character other than a digit");
                    break;
                }
            }
            if(toggle==0 && toggle2==0){
                System.out.println("Valid");
            }
        }else if(reg.length()!=9){
            System.out.println("Invalid");
            System.out.println("java.lang.IllegalArgumentException: Register Number does not contain exactly 9 characters");
        }else if(mob.length()!=10){
            System.out.println("Invalid");
            System.out.println("java.lang.IllegalArgumentException: Mobile Number does not contain exactly 10 characters");
        }else{
            System.out.println("Valid");
        }
    }
}
