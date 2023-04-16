package Latihan.dimensi;

public class Main {
    public static void main(String[] args){
        Titik t1 = new Titik(5,8);
        Titik t2 = new Titik(2,4);
        Garis g1 = new Garis(t1, t2);

        System.out.println(g1);

        System.out.println("Garis dari (5,8) sampai (2,4)");
        System.out.println(g1.getPanjang());

        t1.naik();

        System.out.println(g1);
        System.out.println("Garis dari (5,9) sampai (2,4)");
        System.out.println(g1.getPanjang());
    }
}
