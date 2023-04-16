package PBOpraktek.pewarisan2;

public class Ikan extends Item{
    int coin;

    public Ikan(int harga, String nama){
        super(nama, harga);
    }

    public void eatSomething(){
        this.coin += 1;
    }

    public void produceCoin(){
        System.out.println("Koin dari ikan: "+coin);
    }
}
