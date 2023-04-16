package PBOpraktek.belajarClass;

public class Segitiga {

    int alas;
    int tinggi;

    // segitiga siku2

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double sisi(){
        return Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
    }

    public double getKeliling(){
        return sisi() + alas + tinggi;
    }

    public double getLuas(){
        return 0.5 * alas * tinggi;
    }

    public String toString(){
        return "Segitiga ini memiliki: " +
                "alas = " + alas +
                ", tinggi = " + tinggi +
                ", sisi = " + this.sisi() +
                ", keliling = " + this.getKeliling()+
                ", luas = " + this.getLuas();
    }
}
