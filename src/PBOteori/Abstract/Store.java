package PBOteori.Abstract;

import java.util.ArrayList;

public class Store{
    ArrayList<Product> produk = new ArrayList<>();
    ArrayList<Idecayable> busuk = new ArrayList<>();

    public void canSell(Product p) {
        if(p instanceof Idecayable){
            busuk.add((Idecayable) p);
        }
        produk.add(p);
    }

    public void GetProduct(){
        for (Product product : produk) {
            System.out.println(product + "Cara Memakai: " + product.howToUse());
        }
    }

    public void ExpiredProduct(){
        for (Idecayable idecayable : busuk) {
            System.out.println(idecayable + "Cara menyimpan: " + idecayable.howToSaveProduct());
        }
    }

    public void ListProduct(){
        System.out.println(produk);
    }

    public void ListExpired(){
        System.out.println(busuk);
    }


}
