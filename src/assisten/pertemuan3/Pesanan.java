package assisten.pertemuan3;

public class Pesanan {
    Film film;
    Studio studio;
    Penonton penonton;
    Tiket tiket;

    public Pesanan(Film film, Studio studio, Penonton penonton, Tiket tiket) {
        this.film = film;
        this.studio = studio;
        this.penonton = penonton;
        this.tiket = tiket;
    }

    public double TotalHarga() {
        return tiket.JumlahKursi() * studio.HargaTiket();
    }

    public String kursiTersedia(){
        if(tiket.JumlahKursi() < studio.kursiStudio()){
            return "Berhasil Memesan";
        } else {
            return "Gagal Memesan";
        }
    }

    public String toString() {
        return "####### Pesanan #######" + "\n" +
                "Film : " + film + "\n" +
                "Studio : " + studio + "\n" +
                "Penonton : " + penonton + "\n" +
                "Jumlah Tiket : " + tiket + "\n" +
                "Total Harga : " + TotalHarga() + "\n" +
                kursiTersedia() + "\n" +
                "--------------------------";
    }
}
