package UASno1;

public class Main {
    public static void main(String[] args) {
        Gelas A = new Gelas(0,7);
        Gelas B = new Gelas(0,9);
        A.isiPenuh();
        A.tuang(B);
        A.isiPenuh();
        A.tuang(B);
        B.buang();
        A.tuang(B);

        System.out.println("Gelas A = " + A);
        System.out.println("Gelas B = " + B);

    }

}
