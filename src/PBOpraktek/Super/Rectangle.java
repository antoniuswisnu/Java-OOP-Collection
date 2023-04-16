package PBOpraktek.Super;

public class Rectangle extends TwoDShape{

    Rectangle(double p, double l){
        super(p,l,"segiempat");
    }

    // constructor dengan 1 parameter
    // untuk persegi (sisi sama)
    Rectangle(double p){
        super(p,p,"persegi");
    }

    boolean isSquare(){
        return(getPanjang() == getLebar());
    }

    @Override
    double luas(){
        return getPanjang() * getLebar();
    }

    void showLuas(){
        System.out.println("Luas segitiga: " + luas());
    }
}
