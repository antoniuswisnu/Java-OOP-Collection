package assisten.pertemuan5;

public class Segitiga {
    private int alas;
    private int tinggi;
    private double luas;

    public void setAlas(int a){
        if (a > 0){
            this.alas = a;
        } else {
            this.alas = 0;
        }
    }

    public void setTinggi(int t){
        if (t > 0){
            this.tinggi = t;
        } else {
            this.tinggi = 0;
        }
    }

    public double getLuas(){
        this.luas = this.alas * this.tinggi * 0.5;
        return this.luas;
    }
}
