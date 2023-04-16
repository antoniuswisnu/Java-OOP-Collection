package PBOpraktek.belajarClass;

public class Tabung {

    double jari2;
    int panjang;
    int lebar;
    int tinggi ;

    // luas permukaan, volume

    public Tabung(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public Tabung (double jari2){
        this.jari2 = jari2;
    }

    public  double getKeliling(){
        return 2 * 3.14 * jari2;
    }

    public double getSelimut(){
        return getKeliling() * tinggi;
    }

    public double getLuasAlas(){
        return 2 * 3.14 * jari2 * jari2;
    }

    public double getVolume(){
        return 3.14 * jari2 * jari2 * tinggi;
    }

    public double getLuasPermukaan(){
        return  2 * getSelimut() * getLuasAlas();
    }

    public String toString(){
        return "Tabung ini memiliki: " +
                "panjang = " + panjang +
                ", lebar = " + lebar +
                ", tinggi = " + tinggi +
                ", Volume= " + getVolume()+
                ", luas Permukaan = " + this.getLuasPermukaan();
    }
}
