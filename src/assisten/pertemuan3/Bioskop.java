package assisten.pertemuan3;

import java.util.ArrayList;

public class Bioskop {
    String nama;
    String alamat;
    ArrayList<Film> filmList;

    public Bioskop(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.filmList = new ArrayList<>();
    }

    public void tambahFilm(Film film) {
        filmList.add(film);
    }

    public String toString() {
        return "Bioskop{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", filmList=" + filmList +
                '}';
    }
}
