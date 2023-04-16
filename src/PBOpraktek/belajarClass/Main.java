package PBOpraktek.belajarClass;

public class Main {
    public static void main(String[] args){
        Lingkaran L1 = new Lingkaran(4);
        Balok B1 = new Balok(4,5,6);
        PersegiPanjang PP = new PersegiPanjang(4,5);
        Segitiga S1 = new Segitiga(3,4);
        Segiempat S4 = new Segiempat(3,4);
        Tabung T1 = new Tabung(7,3,4);

        System.out.println(L1);
        System.out.println("lingkaran L1 memiliki:");
        System.out.println("jari-jari: " + L1.jari2);
        System.out.println("keliling: " + L1.getKeliling());
        System.out.println("luas: " + L1.getLuas());

        System.out.println(B1);
        System.out.println(PP);
        System.out.println(S1);
        System.out.println(T1);
        System.out.println(S4);

        L1.jari2 += 5;
        System.out.println("jari-jari L1 menjadi " + L1.jari2);

        Game tetris = new Game();
        Game darts = new Game(501);

        System.out.println("Score init tetris = " + tetris.mScore);
        System.out.println("Score init dart = " + darts.mScore);
    }
}
