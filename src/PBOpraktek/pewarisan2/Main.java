package PBOpraktek.pewarisan2;

public class Main {
    public static void main(String[] args){
        User akun1 = new User(0, 1500);
        Ikan ikan1 = new Ikan(200,"Ikan Badut");
        Ikan ikan2 = new Ikan(500,"Ikan Arwana");
        Kerang kerang1 = new Kerang(150, "Kerang sakti");
        Hiasan hiasan1 = new Hiasan(50, "Batu hias");

        akun1.membeli(ikan1.getHarga());
        akun1.membeli(ikan2.getHarga());
        akun1.membeli(kerang1.getHarga());
        akun1.membeli(hiasan1.getHarga());

        for(int i = 0; i <= 24; i++){
            kerang1.producePearl();
            if (i == 7 || i == 12 || i == 17){
                ikan1.eatSomething();
                ikan2.eatSomething();
                akun1.tambahCoin(ikan1.getCoin());
                akun1.tambahCoin(ikan2.getCoin());
            } else if (i == 24){
                kerang1.changePearltoCoin();
                akun1.tambahCoin(kerang1.getCoin());
                akun1.kurangCoin(hiasan1.dailyService());
                ikan1.produceCoin();
                ikan2.produceCoin();
            }
        }
        
        System.out.println("Akun1 memiliki uang sebanyak: " + akun1.uang);
        System.out.println("Akun1 memiliki coin sebanyak: " + akun1.coin);
    }
}
