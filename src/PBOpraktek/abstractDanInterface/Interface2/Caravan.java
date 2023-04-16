package PBOpraktek.abstractDanInterface.Interface2;

public class Caravan implements Movable, Habitable {
    int max;
    Position position;


    public Caravan(int max, Position positon){
        this.max = max;
        this.position = positon;
    }

    @Override
    public boolean canMove(){
        return position.x > 0 && position.y > 0 &&
                position.x < 100 && position.y < 100;
    }

    @Override
    public void move(int distance){
        position.x += distance;
        position.y += distance;
    }

    @Override
    public boolean canFit(int inhabitants){
        return inhabitants < max;
    }


//    @Override
//    public String toString(){
//        return "Bisa muat = " + canFit() + "\n" +
//                "Bisa bergerak = " +  canMove() + "\n" ;
//    }
}
