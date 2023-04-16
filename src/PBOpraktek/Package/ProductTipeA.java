package PBOpraktek.Package;

public class ProductTipeA extends Product{
    public ProductTipeA(String nama, int harga) {
        super(nama, harga);
    }

    public static void main(String[] args){
        Product produk = new Product("Mac Book M1", 3000000);

        System.out.println(produk.getNama());
        System.out.println(produk.harga);

    }
}
