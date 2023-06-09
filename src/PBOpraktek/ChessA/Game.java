package PBOpraktek.ChessA;

public class Game {
    private Piece[][] board;
    
    Game() {
        board = new Piece[8][8];
    }
    
    public Piece[][] getBoard() {
        return board;
    }
    
    public boolean addPiece(Piece p) {
        if (board[p.getPositionX() - 1][p.getPositionY() - 1] == null) {
            board[p.getPositionX() - 1][p.getPositionY() - 1] = p;
            return true;
            
        } else {
            return false;
        }
    }
    
    public void movePiece(Piece p, int x , int y) {
        int oldX = p.getPositionX();
        int oldY = p.getPositionY();
        
        if(p.setPosition(x, y)) {
            board[oldX - 1][oldY - 1] = null;
            board[p.getPositionX() - 1][p.getPositionY() - 1] = p;
        } 
    }
    
    public void printBoard() {
        for (int i = 0; i < 8 ; i++ ) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " | ");
                
            }
            System.out.println();
        }
    }
    
}
