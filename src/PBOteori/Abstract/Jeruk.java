package PBOteori.Abstract;

public class Jeruk extends Product implements Idecayable{
    public Jeruk(int price){
        this.price = price;
    }

    @Override
    public String howToUse() {
        return "Kupas kulitnya lalu makan";
    }

    @Override
    public String howToSaveProduct() {
        return "Simpan di kulkas yang dingin";
    }

    public String toString(){
        return "Jeruk ";
    }
}
