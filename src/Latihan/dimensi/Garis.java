package Latihan.dimensi;

public class Garis{
    Titik titikAwal;
    Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang(){
        double jarakX = Math.pow((titikAkhir.getKoordX() - titikAwal.getKoordX()), 2);
        double jarakY = Math.pow((titikAkhir.getKoordY() - titikAwal.getKoordY()), 2);
        double jarak = Math.pow((jarakX+jarakY),0.5);
        return jarak;
    }

    public String toString(){
        return "Garis dari " + titikAwal + "sampai " + titikAkhir;
    }

}
