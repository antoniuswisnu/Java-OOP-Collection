package PBOpraktek.Package;

public class ProductApp {
    public static void main(String[] args){
        Product produk = new Product("Mac Book M1", 3000000);

        System.out.println(produk.nama);
        System.out.println(produk.harga);

    }
}
