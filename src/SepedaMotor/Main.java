package SepedaMotor;

public class Main {
    public static void main(String[] args){
        Orang orang1 = new Orang("Wisnu","Jogja","347xxx");
        SepedaMotor spd1 = new SepedaMotor("Vario");
        SepedaMotor spd2 = new SepedaMotor("Lexi");
        SepedaMotor spd3 = new SepedaMotor("Nmax");

        orang1.beli_motor(1000000, spd1);
        orang1.beli_motor(1200000, spd2);
        orang1.beli_motor(3500000, spd3);
        orang1.daftar_motor();
        spd1.setPemilik(orang1);
        spd2.setBensin(15.0);
        spd2.jalan();
        System.out.println("Motor milik " + spd1.getPemilik());




    }
}
