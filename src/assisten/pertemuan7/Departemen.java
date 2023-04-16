package assisten.pertemuan7;

public class Departemen {
    protected double gajiDasar;
    protected String namaDepartemen;

    public Departemen(double gajiDasar, String namaDepartemen) {
        this.gajiDasar = gajiDasar;
        this.namaDepartemen = namaDepartemen;
    }

    public double getGajiDasar() {
        return gajiDasar;
    }

    public void setGajiDasar(double gajiDasar) {
        this.gajiDasar = gajiDasar;
    }
}
