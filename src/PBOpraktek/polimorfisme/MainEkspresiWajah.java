package PBOpraktek.polimorfisme;

class MainEkspresiWajah {
    public static void main(String args [] ){
        EkspresiWajah objEkspresi = new EkspresiWajah();
        Gembira objGembira = new Gembira();
        Sedih objSedih = new Sedih();
        Marah objMarah = new Marah();

        EkspresiWajah[] arrEkpsresi = new EkspresiWajah[4];
        arrEkpsresi[0] = objEkspresi;
        arrEkpsresi[1] = objGembira;
        arrEkpsresi[2] = objSedih;
        arrEkpsresi[3] = objMarah;

        System.out.println("Ekspresi[0] : "+ arrEkpsresi[0].respons());
        System.out.println("Ekspresi[1] : "+ arrEkpsresi[1].respons());
        System.out.println("Ekspresi[2] : "+ arrEkpsresi[2].respons());
        System.out.println("Ekspresi[3] : "+ arrEkpsresi[3].respons());
    }
}
