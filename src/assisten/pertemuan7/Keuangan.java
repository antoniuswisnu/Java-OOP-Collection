package assisten.pertemuan7;

public class Keuangan extends Departemen {
    private double tunjanganKesehatan;
    private double tunjanganPensiun;

    public Keuangan(double gajiDasar, String namaDepartemen, double tunjanganKesehatan, double tunjanganPensiun) {
        super(gajiDasar, namaDepartemen);
        this.tunjanganKesehatan = tunjanganKesehatan;
        this.tunjanganPensiun = tunjanganPensiun;
    }

    public double hitungTunjangan() {
        return tunjanganKesehatan + tunjanganPensiun;
    }
}
