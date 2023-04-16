package PBOpraktek.belajarClass;

public class Segiempat {

    double panjang, lebar;

    public Segiempat(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getLuas(){
        return panjang * lebar;
    }

    public double getKeliling(){
        return 2 * (panjang + lebar);
    }

    public String toString(){
        return "Segiempat ini memiliki: " +
                "panjang = " + panjang +
                ", lebar = " + lebar +
                ", keliling = " + this.getKeliling()+
                ", luas = " + this.getLuas();
    }
}
