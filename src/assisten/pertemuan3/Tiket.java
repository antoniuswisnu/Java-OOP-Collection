package assisten.pertemuan3;

public class Tiket {
    int jumlahKursi;

    public Tiket(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public int JumlahKursi() {
        return jumlahKursi;
    }

    public String toString() {
        return "" + jumlahKursi + "";
    }
}
