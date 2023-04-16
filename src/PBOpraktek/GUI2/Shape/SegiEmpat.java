package PBOpraktek.GUI2.Shape;

public class SegiEmpat extends TwoDShape {

    public SegiEmpat(double p, double l) {
        super(p, l);
    }

    @Override
    public double luas(){
        return getPanjang()*getLebar();
    }

    @Override
    public double keliling(){
        return (2*getPanjang())+(2*getLebar());
    }

}
