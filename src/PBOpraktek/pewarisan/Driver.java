package PBOpraktek.pewarisan;

public class Driver {
    public static void main(String[] args){
        Tabung x = new Tabung(10,7);
        System.out.println("Volume Tabung adalah "+ x.getVolume());
        System.out.println("Keliling Tabung adalah "+ x.getKeliling());
    }
}
