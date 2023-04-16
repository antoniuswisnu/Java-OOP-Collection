package assisten.pertemuan5;

public class PersegiPanjang {

    private int panjang;
    private int lebar;
    private double luas;

    public void setPanjang(int p){
        if (p > 0){
            this.panjang = p;
        } else {
            this.panjang = 0;
        }
    }

    public void setLebar(int l){
        if (l > 0){
            this.lebar = l;
        } else {
            this.lebar = 0;
        }
    }

    public double getLuas(){
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
}