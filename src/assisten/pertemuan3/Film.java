package assisten.pertemuan3;

public class Film {
    String judul;
    int durasi;
    String genre;

    public Film(String judul, int durasi, String genre) {
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
    }

    public String toString() {
        return
                "judul = '" + judul + '\'' +
                ", durasi = " + durasi +
                ", genre = '" + genre + '\''
               ;
    }
}
