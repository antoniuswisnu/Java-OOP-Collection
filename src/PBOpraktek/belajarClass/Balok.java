package PBOpraktek.belajarClass;

public class Balok {

    int panjang;
    int lebar;
    int tinggi;

    // luas permukaan, volume

    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getVolume(){
        return 4 * (panjang * lebar * tinggi);
    }

    public double getLuasPermukaan(){
        return 2 * ((panjang*lebar) + (panjang*tinggi) + (tinggi*lebar));
    }

    public String toString(){
        return "Balok ini memiliki: " +
                "panjang = " + panjang +
                ", lebar = " + lebar +
                ", tinggi = " + tinggi +
                ", Volume = " + this.getVolume()+
                ", luas Permukaan = " + this.getLuasPermukaan();
    }

}
