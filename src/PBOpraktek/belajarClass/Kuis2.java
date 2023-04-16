package PBOpraktek.belajarClass;

public class Kuis2 {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran(4);
        Lingkaran L2 = new Lingkaran(7.5);
        Lingkaran L3 = new Lingkaran(10);
        Lingkaran L4 = new Lingkaran(5);

        Segiempat P1 = new Segiempat(35, 30);

        System.out.println("Panjang pagar untuk\n" +
                "memagari aera yang diarsir = " + (P1.getKeliling() + L1.getKeliling() + L2.getKeliling() + L3.getKeliling() + L4.getKeliling()));
    }
}
