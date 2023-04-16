package PBOpraktek.pewarisan;

public class Checking extends BankAccount{

//    String accNumber;
//    double balance;
    double limit;

    public Checking(String accNumber, double balance, double limit){
        super(accNumber);
        //this.accNumber = accNumber;
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public String toString(){
        return
                "accNumber : " + accNumber + "\n" +
                        "balance : " + balance + "\n" +
                        "limit : " + limit + "\n";

    }
}
