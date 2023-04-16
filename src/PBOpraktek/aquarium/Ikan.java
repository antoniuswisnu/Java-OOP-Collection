package PBOpraktek.aquarium;

public class Ikan extends Item {
    public Ikan(String nama,int harga, int coin){
        this.nama = nama;
        this.harga = harga;
        this.coin = coin;
    }

    public void eatSomething(){
        coin = coin + 1;
    }

    public int produceCoin(){
        return coin;
    }
}
