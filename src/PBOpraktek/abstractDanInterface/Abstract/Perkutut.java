package PBOpraktek.abstractDanInterface.Abstract;

class Perkutut extends Hewan {
    public Perkutut(){
        super("perkutut",2, true);
    }
    public void bersuara() {
        System.out.println("\n cuit, cuit, cuit");
    }
}