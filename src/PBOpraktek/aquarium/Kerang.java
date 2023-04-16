package PBOpraktek.aquarium;

public class Kerang extends Item{
    int pearl;

    public Kerang(String nama, int harga){
        this.harga = harga;
        this.nama = nama;
        this.coin = 0;
        this.pearl = 0;
    }

    private int getPearl() {
        return pearl;
    }

    public void producePearl(){
        pearl = pearl + 5;
    }

    private void changePearlToCoin(){
        if (getPearl() >= 20){
            int res = getPearl()%20;
            coin = coin + (getPearl()-res)/20*3;
        }
    }

    public int produceCoin(){
        changePearlToCoin();
        return coin;
    }
}
