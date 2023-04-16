package PBOpraktek.pewarisan2;

public class User {
    double uang;
    int coin;

    User(int coin, double uang) {
        this.coin = coin;
        this.uang = uang;
    }

    public void membeli(double harga) {
        if (this.uang > harga) {
            this.uang -= harga;
        } else {
            System.out.println("Uang tidak cukup untuk membeli item");
        }
    }

    public void tambahCoin(int coin) {
        this.coin += coin;
    }

    public void kurangCoin(int coin) {
        if (this.coin < coin) {
            System.out.println("Coin tidak cukup untuk merawat hiasan");
        } else {
            this.coin -= coin;
        }
    }

}
