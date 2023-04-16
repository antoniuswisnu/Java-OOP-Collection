package PBOpraktek.ChessA;

public class Pawn extends Piece{
    public Pawn(String color, int x, int y) {
        super(color,x ,y );
    }
    
    public void move() {
        setPosY(this.getPositionY() + 1);
    }
    
    public String toString() {
        return "Pawn";
    }
}
