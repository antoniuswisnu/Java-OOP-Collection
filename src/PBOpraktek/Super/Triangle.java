package PBOpraktek.Super;

public class Triangle extends TwoDShape {
    private String warna;

    Triangle(double p, double l, String w){
//        setPanjang(p);
//        setLebar(l);
        super(p,l,"segitiga");
        warna = w;
    }

    void showLuas(){
        System.out.println("Luas segitiga: " + luas());
    }

    void showWarna(){
        System.out.println("Luas segitiga: " + warna);
    }

    @Override
    double luas(){
        return getPanjang() * getLebar() / 2;
    }
}
