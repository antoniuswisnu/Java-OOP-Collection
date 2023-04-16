package PBOpraktek.TugasAbstractStaticFinal.No2;

import java.awt.geom.Area;

public class Main {
    public static void main(String[] args){

        // 2a
        Circle circle1 = new Circle();
        System.out.println("Luas lingkaran: "  +circle1.luas(7));
        // circle1.pi = 10; akan error karena final

        // 2b
        LivingRoom livingRoom1 = new LivingRoom();
        System.out.println("Are Living Room: " + livingRoom1.Area(14));
    }
}
