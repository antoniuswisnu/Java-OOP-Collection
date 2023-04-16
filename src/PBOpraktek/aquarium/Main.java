package PBOpraktek.aquarium;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ikan ikan1 = new Ikan("nemo",200,30);
        Ikan ikan2 = new Ikan("dori",500,50);
        Kerang kerang1 = new Kerang("patrick", 150);
        Hiasan hiasan1 = new Hiasan("airmancur", 50);

        // Belanja
        int uang = 0;
        ArrayList<Item> listbelanja = new ArrayList<>();
        listbelanja.add(ikan1);
        listbelanja.add(ikan2);
        listbelanja.add(kerang1);
        listbelanja.add(hiasan1);
        for (Item var : listbelanja)
        {
            uang = uang - var.getHarga();
        }

        // Activity
        int hari = 2;
        int koin = 0;
        for(int i=1; i<(24*hari)+1; i++){
            int reset = i%24;
            if (reset==7 || reset==12 || reset==17){
                ikan1.eatSomething();
                ikan2.eatSomething();
            }
            kerang1.producePearl();
            if (reset==0){
                koin += ikan1.produceCoin();
                koin += ikan2.produceCoin();
                koin += kerang1.produceCoin();
                koin += hiasan1.dailyService();
                System.out.println("dailyService "+hiasan1.dailyService());
            }

        }

        System.out.println("Uang sisa: "+uang);
        System.out.println("Koin terkumpul: "+koin);

    }

}
