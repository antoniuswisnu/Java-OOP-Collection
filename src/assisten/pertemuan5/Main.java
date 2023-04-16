package assisten.pertemuan5;

public class Main {
    public static void main(String[] args) {
        Segitiga st1 = new Segitiga();
        st1.setAlas(8);
        st1.setTinggi(7);
        double luasADE = st1.getLuas();

        Segitiga st2 = new Segitiga();
        st2.setAlas(8);
        st2.setTinggi(7);
        double luasCBF = st2.getLuas();

        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(14);
        pp1.setLebar(7);
        double luasCDEF = pp1.getLuas();

        Lingkaran l1 = new Lingkaran();
        l1.setJejari(7);
        double luasX = 0.5 * l1.getLuas();

        double luasArsir = luasADE + luasCBF + luasCDEF - luasX;
        System.out.println("Luas daerah diarsir: " + luasArsir + " cm2");
    }
}
