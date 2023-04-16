package PBOteori.Abstract;

public class Main {
    public static void main(String[] args){
        Cokelat cokelat = new Cokelat(5000);
        Tomat tomat = new Tomat(3000);
        Kipas kipas = new Kipas(1900);
        Jeruk jeruk = new Jeruk(1500);

        Store store = new Store();
        store.canSell(cokelat);
        store.canSell(tomat);
        store.canSell(kipas);
        store.canSell(jeruk);

        store.GetProduct();
        System.out.println("------------");
        store.ExpiredProduct();
        System.out.println("------------");
        store.ListProduct();
        store.ListExpired();
    }
}
