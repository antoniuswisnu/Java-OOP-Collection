package PBOpraktek.abstractDanInterface.Interface2;

public class Main {
    public static void main(String[] args){
        Caravan caravan = new Caravan(5, new Position(1,1));
        System.out.println("Can Move? " + caravan.canMove());
        System.out.println("Can Fit? " + caravan.canFit(4));
        if(caravan.canMove()){
            caravan.move(20);
            System.out.println("Current Position =" + caravan.position);
        }

        // buat interface untuk tipe robotable
        // buat object untuk contoh transformer
        Transformer bumblebee = new Transformer("Fire", 3);
        if (bumblebee.canFight()){
            System.out.println(bumblebee);
        }




    }
}
