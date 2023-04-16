package PBOpraktek.pewarisan;

public class Savings extends BankAccount{

//    String accNumber;
//    double balance;
    int transfers;

    public Savings(String accNumber, double balance, int transfers){
        super(accNumber);
        //this.accNumber = accNumber;
        this.balance = balance;
        this.transfers = transfers;
    }

    @Override
    public String toString(){
        return
                "accNumber : " + accNumber + "\n" +
                        "balance : " + balance + "\n" +
                        "transfer : " + transfers + "\n";
    }

}
