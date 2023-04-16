package PBOpraktek.abstractDanInterface.Abstract;

public class Main {
    public static void main(String[] args){
        Sapi Sapi = new Sapi();
        Sapi.isHewan();
        Sapi.bersuara();
        Hewan.makan();

        Perkutut p = new Perkutut();
        p.isHewan();
        p.bersuara();
    }
}
