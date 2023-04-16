package PBOpraktek.aquarium;

public class Hiasan extends Item{
    public Hiasan(String nama, int harga){
        this.harga = harga;
        this.nama = nama;
    }

    public int dailyService(){
        int cost = (int)(0.1*harga);
        return -cost;
    }
}
