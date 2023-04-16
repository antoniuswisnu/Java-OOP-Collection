package PBOteori.Encapsulation;

public class Main {
    public static void main(String[] args){
        String name;
        int saldo, simpanSaldo, ambilSaldo;

        Bank bank = new Bank();
          bank.setName("ABC");
          bank.setSaldo(100000);
          bank.setSimpanSaldo(500000);
          bank.setAmbilSaldo(150000);

          name = bank.getName();
          saldo = bank.getSaldo();
          simpanSaldo = bank.getSimpanSaldo();
          ambilSaldo = bank.getAmbilSaldo();

        System.out.println("Selamat Datang di Bank " + name);
        System.out.println("Saldo saat ini: Rp" + saldo);
        System.out.println(" ");
        System.out.println("Simpan uang: Rp" + simpanSaldo);
        //bank.getSimpanSaldo();
        System.out.println("Saldo saat ini: Rp" + saldo);
        System.out.println(" ");
        System.out.println("Ambil uang: Rp" + ambilSaldo);
        //bank.getAmbilSaldo();
        System.out.println("Saldo saat ini: Rp" + saldo);
    }
}
