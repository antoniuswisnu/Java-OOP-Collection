package PBOpraktek.abstractDanInterface.Interface2;

public class Transformer implements Robotable, Movable, Habitable {
    String ability;
    int power;
    int max;
    Position position;

    public Transformer(String ability, int power) {
        this.ability = ability;
        this.power = power;
    }

    @Override
    public boolean canFight() {
        return power > 0;
    }

    @Override
    public void move(int distance) {
        position.x += distance;
        position.y += distance;
        ;
    }

    @Override
    public boolean canMove() {
        return position.x > 0 && position.y > 0 &&
                position.x < 100 && position.y < 100;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return false;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i <= power; i++) {
            res += ability + " !! ";
        }
        return res;
    }
}