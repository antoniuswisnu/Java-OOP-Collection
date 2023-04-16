package PBOteori.uts;

public class Floor {
    public int currentFloor;
    private final static int MAX_FLOOR = 20;

    public Floor() {
        currentFloor = 1;
    }
    public void goingUp() {
        if (currentFloor < MAX_FLOOR) {
            currentFloor += 1;
            System.out.println("You have arrived in " + String.valueOf(currentFloor) + " floor");
        }
        else {
            System.out.println("You have reached the maximum floor");
        }
    }
    public void goingDown() {
        if (currentFloor > 0) {
            currentFloor -= 1;
            System.out.println("You have arrived in " + String.valueOf(currentFloor) + " floor");
        }
        else {
            System.out.println("You have reached the minimum floor");
        }
    }
}
