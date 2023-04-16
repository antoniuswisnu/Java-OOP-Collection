package PBOteori.Abstract;

public class Kipas extends Product{

    public Kipas(int price){
        this.price = price;
    }

    @Override
    public String howToUse() {
        return "Dicolokkan ke listrik lalu pencet tombol";
    }

    public String toString(){
        return "Kipas ";
    }
}
