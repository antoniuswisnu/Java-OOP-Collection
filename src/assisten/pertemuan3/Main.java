package assisten.pertemuan3;

public class Main {
    public static void main(String[] args) {
        // Membuat objek bioskop
        Bioskop bioskop = new Bioskop("CGV","Jalan Solo");

        // Menambahkan film ke dalam daftar film di bioskop
        Film film1 = new Film("Avengers: Endgame",  181, "Action/Adventure");
        Film film2 = new Film("Joker", 122, "Crime/Drama");
        bioskop.tambahFilm(film1);
        bioskop.tambahFilm(film2);

        // Membuat objek studio di bioskop
        Studio studio1 = new Studio(1, 50, 50000);
        Studio studio2 = new Studio(2, 30, 40000);

        // Membuat objek penonton
        Penonton penonton1 = new Penonton("Mamad", "123456789", 'L');
        Penonton penonton2 = new Penonton("Akbar", "987654321", 'L');

        // Membuat objek tiket
        Tiket tiket1 = new Tiket(51);
        Tiket tiket2 = new Tiket(3);

        // Membuat pesanan tiket untuk film Avengers: Endgame di studio 1
        Pesanan pesanan1 = new Pesanan(film1, studio1, penonton1, tiket1);
        System.out.println(pesanan1);

        // Membuat pesanan tiket untuk film Joker di studio 2
        Pesanan pesanan2 = new Pesanan(film2, studio2, penonton2, tiket2);
        System.out.println(pesanan2);
    }
}
