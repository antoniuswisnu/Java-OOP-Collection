package PBOpraktek.GUI.Shape;

public class Segitiga extends TwoDShape{
    public Segitiga(double p, double l) {
        super(p, l);
    }

    @Override
    public double luas(){
        return 0.5*getPanjang()*getLebar();
    }

    @Override
    public double keliling(){
        double a = getPanjang()*getPanjang();
        double b = getLebar()*getLebar();
        double miring = Math.sqrt(a+b);
        return getPanjang()+getLebar()+miring;
    }

}
