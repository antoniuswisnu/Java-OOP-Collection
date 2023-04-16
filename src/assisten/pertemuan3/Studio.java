package assisten.pertemuan3;

public class Studio {
    int nomorStudio;
    int jumlahKursi;
    double hargaTiket;

    public Studio(int nomorStudio, int jumlahKursi, double hargaTiket) {
        this.nomorStudio = nomorStudio;
        this.jumlahKursi = jumlahKursi;
        this.hargaTiket = hargaTiket;
    }

    public int kursiStudio(){
        return jumlahKursi;
    }

    public double HargaTiket() {
        return hargaTiket;
    }

    public String toString() {
        return
                "Nomor Studio = " + nomorStudio +
                ", Jumlah Kursi = " + jumlahKursi +
                ", Harga Tiket = " + hargaTiket
                ;
    }
}
