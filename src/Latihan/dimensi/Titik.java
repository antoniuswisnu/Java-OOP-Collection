package Latihan.dimensi;

public class Titik {
    private int koordX;
    private int koordY;

    public Titik(int koordX, int koordY){
        this.koordX = koordX;
        this.koordY = koordY;
    }

    public Titik(){
        koordX = 0;
        koordY = 0;
    }

    public void naik(){
        koordY++;
    }

    public void turun(){
        koordY--;
    }

    public void kanan(){
        koordX++;
    }

    public void kiri(){
        koordX--;
    }

    public String toString(){
        return "(" + koordX + "," + koordY + ")";
    }

    public int getKoordX() {
        return koordX;
    }

    public void setKoordX(int koordX) {
        this.koordX = koordX;
    }

    public int getKoordY() {
        return koordY;
    }

    public void setKoordY(int koordY) {
        this.koordY = koordY;
    }

}
