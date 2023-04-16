package PBOpraktek.polimorfisme2;

public class Bags extends Item{
    int currentWeight;

    public Bags(int weight){
        super(weight);
        currentWeight = 0;
    }

    public boolean canAddItem(Item item){
        return currentWeight + item.weight < 20;
    }

    public void addItem(Item item){
        currentWeight += item.weight;
    }

    // override
    public String tostring(){
        return "Berat tas sekarang: "+ currentWeight + "kg";
    }

//    boolean getBag(){
//        if (canAddItem(true)){
//            System.out.println(this.currentWeight);
//        } else{
//            System.out.println("Bags Penuh");
//        }
//        return false;
//    }

}
