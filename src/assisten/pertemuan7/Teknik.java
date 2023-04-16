package assisten.pertemuan7;

public class Teknik extends Departemen{
    private double tunjanganTransportasi;
    private double tunjanganKomunikasi;

    public Teknik(double gajiDasar, String namaDepartemen, double tunjanganTransportasi, double tunjanganKomunikasi) {
        super(gajiDasar, namaDepartemen);
        this.tunjanganTransportasi = tunjanganTransportasi;
        this.tunjanganKomunikasi = tunjanganKomunikasi;
    }

    public double hitungTunjangan() {
        return tunjanganTransportasi + tunjanganKomunikasi;
    }
}
