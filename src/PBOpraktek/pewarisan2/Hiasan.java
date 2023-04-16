package PBOpraktek.pewarisan2;

public class Hiasan extends Item {

    Hiasan(int harga, String nama){
        super(nama, harga);
    }

    // overloading
    public int dailyService(){
        return (int) (this.harga * 0.1);
    }
}
