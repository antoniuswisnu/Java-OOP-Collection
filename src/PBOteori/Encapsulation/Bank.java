package PBOteori.Encapsulation;

public class Bank {
    private int saldo;
    private int simpanSaldo;
    private int ambilSaldo;
    private String namaBank;


    public void setName(String namaBank){
        this.namaBank = namaBank;
    }

    public String getName(){
        return namaBank;
    }

    public void setSaldo(int saldo){
        this.saldo = saldo;
    }

    public Integer getSaldo(){
        return saldo;
    }

    public void setSimpanSaldo(int simpanSaldo){
        this.simpanSaldo = simpanSaldo;
    }

    public Integer getSimpanSaldo(){
        return saldo += simpanSaldo;
    }

    public void setAmbilSaldo(int ambilSaldo){
        this.ambilSaldo = ambilSaldo;
    }

    public Integer getAmbilSaldo(){
        return saldo -= ambilSaldo;
    }


}
