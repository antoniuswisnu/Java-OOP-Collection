package PBOpraktek.pewarisan;

import java.util.Date;

public class Main {
    public static void main(String[] args){

        Date tanggal = new Date();
        Date tanggal2 = new Date(2000,1,1);
//        BankAccount akunChecking = new BankAccount("123-456", 1000, 9.000, 0, tanggal);
//        BankAccount akunSaving = new BankAccount("333-111", 500, 0, 3, tanggal);
//        BankAccount akunDeposit = new BankAccount("975-579", 12.000, 0, 0, tanggal2);

//        System.out.println(akunChecking.toString());
//        System.out.println(akunSaving.toString());
//        System.out.println(akunDeposit.toString());

        // EACH Class
        Checking akunChecking2 = new Checking("123-456", 1000, 9.000);
        Savings akunSaving2 = new Savings("333-111", 500, 3);
        COD akunDeposit2 = new COD("975-579", 12.000, tanggal2);

        System.out.println(akunChecking2.toString());
        System.out.println(akunSaving2.toString());
        System.out.println(akunDeposit2.toString());


    }
}
