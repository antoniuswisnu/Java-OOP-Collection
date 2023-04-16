package PBOpraktek.pewarisan2;

public class Item {
    int harga;
    String nama;
    int coin;

    public Item(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public int getHarga(){
        return this.harga;
    }

    public int getCoin(){
        return this.coin;
    }

}
