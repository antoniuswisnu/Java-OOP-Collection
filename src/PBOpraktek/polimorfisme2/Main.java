package PBOpraktek.polimorfisme2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Bags bag = new Bags(0);

        Map treasureMap = new Map(5,"Yogyakarta");
        Crossbow crossbow = new Crossbow(3,100);
        Coins coins = new Coins(13,2); // akan di skip karena tidak muat
        Key key = new Key(2,123);
        RareItem rareItem = new RareItem(4,1);

        // Mencek isi tas 5 kali, bisa dilakukan dengan loop, menambahkan data ke array list
        ArrayList<Item> allItem = new ArrayList<>();
        allItem.add(crossbow);
        allItem.add(treasureMap);
        allItem.add(coins);
        allItem.add(key);
        allItem.add(rareItem);

        for(Item var: allItem){
            if (bag.canAddItem(var)){
                bag.addItem(var);
            } else {
                System.out.println("Tas Penuh!");
            }
        }


        System.out.println(bag.tostring());
    }
}
