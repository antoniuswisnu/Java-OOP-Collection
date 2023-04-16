package assisten.pertemuan1;

public class Task3 {
    public static void main(String[] args) {
        int belanja = 56000;

        if (belanja > 100000){
            double diskon = 10;
            double hasil = belanja - ((diskon / 100) * belanja);
            System.out.println(hasil);
        } else if (belanja > 75000 && belanja <= 100000 ){
            double diskon = 8;
            double hasil = belanja - ((diskon / 100) * belanja);
            System.out.println(hasil);
        } else if (belanja <= 75000 && belanja > 50000){
            double diskon = 5;
            double hasil = belanja - ((diskon / 100) * belanja);
            System.out.println(hasil);
        }  else if (belanja <= 50000 && belanja > 25000) {
            double diskon = 3;
            double hasil = belanja - ((diskon / 100) * belanja);
            System.out.println(hasil);
        } else {
            double diskon = 0;
            double hasil = belanja - ((diskon / 100) * belanja);
            System.out.println(hasil);
        }

    }
}
