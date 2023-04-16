package PBOteori.Abstract;

public class Cokelat extends Product{

    public Cokelat(int price){
        this.price = price;
    }

    @Override
    public String howToUse() {
        return "Buka bungkus lalu makan ";
    }

    public String toString(){
        return "Cokelat ";
    }

}
