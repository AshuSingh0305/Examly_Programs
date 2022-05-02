package DataStructure.Examly;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcINTEREST {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int accType = sc.nextInt();
        String name = sc.next();
        String accNo = sc.next();
        int amount = sc.nextInt();
        String date1 = sc.next();
        String date2 = sc.next();
        Account account = new Account();
        account.calc(accType, name, accNo, amount, date1, date2);
    }
}

class Account{

    public void calc(int type , String  name  , String accno , int amt , String sdate1 , String sdate2) throws ParseException {
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate1);
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sdate2);

        long diffInTime = date1.getTime() - date2.getTime();

        long difference_In_Years
                = (diffInTime
                / (1000l * 60 * 60 * 24 * 365));
        double interest = 0;
        if(type ==1){
            interest = (0.12*amt)*difference_In_Years;
            if(interest<0){
                interest = 0-interest;
            }
            System.out.println(interest);
        }else{
            interest = (0.05*amt)*difference_In_Years;
            if(interest<0){
                interest = 0-interest;
            }
            System.out.println(interest);
        }
    }
}
