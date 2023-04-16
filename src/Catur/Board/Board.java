package Catur.Board;

import Catur.Common.File;
import Catur.Common.Location;
import Catur.Square.Square;
import Catur.Square.SquareColor;

public class Board {
    private static final Integer Board_Length = 8;
    Square[][] boardSquare = new Square[8][8];

    public Board(){
        for(int i = 0; i < boardSquare.length; i++){
            int kolom = 0;
            SquareColor currentColor = (i % 2 == 0) ? SquareColor.WHITE : SquareColor.BLACK;
            for(File file : File.values()){
                Square newSquare = new Square(currentColor, new Location(file, Board_Length-1));
                boardSquare[i][kolom] = newSquare;
                currentColor = (currentColor == SquareColor.BLACK) ? SquareColor.WHITE : SquareColor.BLACK;
                kolom++;
            }
        }
    }

    public void printBoard(){
        for(Square[] row : boardSquare){
            for(Square square : row){
                System.out.println(square);
            }
            System.out.println();
        }
    }



}
