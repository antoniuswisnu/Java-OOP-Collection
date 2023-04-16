package PBOpraktek.pewarisan;

import java.util.Date;

public class COD extends BankAccount{

//    String accNumber;
//    double balance;
    Date expiry;

    public COD(String accNumber, double balance, Date expiry){
        super(accNumber);
        //this.accNumber = accNumber;
        this.balance = balance;
        this.expiry = new Date();
    }

    @Override
    public String toString(){
        return
                "accNumber : " + accNumber + "\n" +
                        "balance : " + balance + "\n" +
                        "expiry : " + expiry + "\n";
    }
}
