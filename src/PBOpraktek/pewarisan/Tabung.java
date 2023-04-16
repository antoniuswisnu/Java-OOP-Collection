package PBOpraktek.pewarisan;

public class Tabung extends Lingkaran{
    private int tinggi;

    public Tabung(int r , int t){
        super(r);
        this.tinggi = t;
    }
    public double getVolume(){
        return super.getLuas() * this.tinggi;
    }
    public double getKeliling(){
        return super.getLuas() * this.getJari();
    }

}
