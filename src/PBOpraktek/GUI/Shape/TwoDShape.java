package PBOpraktek.GUI.Shape;

public abstract class TwoDShape {
    private double panjang;
    private double lebar;

    TwoDShape(double p, double l){
        panjang = p;
        lebar = l;
    }

    abstract double luas();
    abstract double keliling();

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


}
