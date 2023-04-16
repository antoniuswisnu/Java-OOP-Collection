package PBOpraktek.belajarClass;

public class Kuis1 {
    public static void main(String[] args){
        Lingkaran L1 = new Lingkaran(4);
        Lingkaran L2 = new Lingkaran(7.5);
        Lingkaran L3 = new Lingkaran(10);
        Lingkaran L4 = new Lingkaran(5);

        Segiempat P1 = new Segiempat(35, 30);

        System.out.println("Luas daerah yang diarsir adalah " + (P1.getLuas() - (L1.getLuas() + L2.getLuas() + L3.getLuas() + L4.getLuas())));
    }
}
