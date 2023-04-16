package PBOpraktek.ChessA;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nama : Muhammad Luthfi Azzahra Rammadhani
        // NIM  : 21/478530/SV/19332
        
        Game papan = new Game();
        
        Piece pion = new Pawn("White", 1,1);
        Piece benteng = new Fort("Black",7,2);
        Piece kuda = new Knight("White",7,7);
        
        papan.addPiece(pion);
        papan.addPiece(benteng);
        papan.addPiece(kuda);
        
        papan.printBoard();
        
        
        
        
    }
    
}
