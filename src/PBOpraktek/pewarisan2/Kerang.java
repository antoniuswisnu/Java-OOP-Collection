package PBOpraktek.pewarisan2;

public class Kerang extends Item {
    int coin;
    int pearl;

    public Kerang(int harga, String nama) {
        super(nama, harga);
    }

    public void getPearl() {
        System.out.println(this.pearl);
    }

    void produceCoin(){
        System.out.println(this.coin);
    }

    public void producePearl() {
        this.pearl += 5;
    }

    public void changePearltoCoin() {
        if (this.pearl >= 20) {
            this.coin += 3 * (this.pearl / 20);
        } else {
            System.out.println("Pearl tidak cukup untuk ditukar dengan coin");
        }
    }
}
