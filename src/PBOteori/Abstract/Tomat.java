package PBOteori.Abstract;

public class Tomat extends Product implements Idecayable{

    public Tomat(int price){
        this.price = price;
    }

    @Override
    public String howToUse() {
        return "Langsung makan saja";
    }

    @Override
    public String howToSaveProduct() {
        return "Simpan di kulkas";
    }

    public String toString(){
        return "Tomat ";
    }
}
