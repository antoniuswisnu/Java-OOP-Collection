package PBOpraktek.ChessA;

public class Fort extends Piece {
    public Fort(String color, int x, int y) {
        super(color,x ,y );
    }
    
    public boolean isValidMove(int stepx, int stepy) {
        if (stepx == 0 || stepy == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void cetak() {
        System.out.println("Ini Kelas Fort");
    }
    
    public void desc() {
        System.out.println("Deskripsi kelas fort");
    }
    
    @Override
    public boolean setPosition(int x, int y) {
        if (isValidMove(x - this.getPositionX() , y - this.getPositionY()) ) {
            return super.setPosition(x,y);
        } else {
            return false;
        }
    }
    
    public String toString() {
        return "Fort";
    }
}
