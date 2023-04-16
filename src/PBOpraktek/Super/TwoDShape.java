package PBOpraktek.Super;

abstract public class TwoDShape {
    private double panjang;
    private double lebar;
    private String nama;

    TwoDShape(double p, double l, String n){
        panjang = p;
        lebar = l;
        nama = n;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    abstract double luas();

    void showDim(){
        System.out.println("Panjang dan lebar: "+panjang+
                " dan " + lebar);
    }
}
