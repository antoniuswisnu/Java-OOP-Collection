package PBOpraktek.Package;

public class Product {


    String nama;
    int harga;

    public Product(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString(){
        return "Detail produk: " + nama + " " + harga;
    }

    public String getNama() {
        return nama;
    }
}
