package PBOpraktek.GUI2.Shape;

public class Lingkaran extends TwoDShape {
    public Lingkaran(double p, double l) {
        super(p, l);
    }

    @Override
    public double luas(){
        return 3.14*getPanjang()*getLebar();
    }

    @Override
    public double keliling(){
        return (2*3.14*getPanjang());
    }

}
