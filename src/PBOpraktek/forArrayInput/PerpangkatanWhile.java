package PBOpraktek.forArrayInput;

public class PerpangkatanWhile {
    public static void main(String[] args){

        int nilai = 4;
        int pangkat = 3;
        double hasil = 1;
        int i = 1;

        while(i <= pangkat) {
            hasil *= nilai;
            i++;
        }
        System.out.println(nilai+" pangkat "+pangkat+" adalah "+hasil);
    }
}
