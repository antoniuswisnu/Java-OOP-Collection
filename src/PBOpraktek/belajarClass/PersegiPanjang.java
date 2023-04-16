package PBOpraktek.belajarClass;

public class PersegiPanjang {

    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getKeliling(){
        return 2 * (panjang + lebar);
    }

    public double getLuas(){
        return panjang * lebar;
    }

    public String toString(){
        return "Persegi panjang ini memiliki: " +
                "panjang = " + panjang +
                ", lebar = " + lebar +
                ", keliling = " + this.getKeliling() +
                ", luas = " + this.getLuas();
    }

}
