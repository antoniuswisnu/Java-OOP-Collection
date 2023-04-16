package PBOpraktek.forArrayInput;

public class PerpangkatanDoWhile {
    public static void main(String[] args){

        int nilai = 2;
        int pangkat = 4;
        double hasil = 1;
        int i = 1;

        do{
            hasil *= nilai;
            i += 1;
        } while(i<=pangkat);
        System.out.println(nilai+" pangkat "+pangkat+" adalah "+hasil);
    }
}
