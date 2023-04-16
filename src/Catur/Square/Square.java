package Catur.Square;

import Catur.Common.Location;

public class Square {
    private final SquareColor squareColor;
    private final Location location;
    private boolean IsOccupied;

    public Square(SquareColor squareColor, Location location){
        this.squareColor = squareColor;
        this.location = location;
        this.IsOccupied = false;
    }

    public void reset(){
        this.IsOccupied = false;
    }

    public SquareColor getSquareColor() {
        return squareColor;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isOccupied() {
        return IsOccupied;
    }

    public void setOccupied(boolean occupied) {
        IsOccupied = occupied;
    }

    @Override
    public String toString() {
        return "Square{" +
                "squareColor=" + squareColor +
                ", location=" + location +
                ", IsOccupied=" + IsOccupied +
                '}';
    }
}
