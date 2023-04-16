package PBOpraktek.forArrayInput;

public class PerpangkatanFor {
    public static void main(String[] args) {
        int nilai = 5;
        int pangkat = 3;
        double hasil = 1;

        for (int i=1; i<=pangkat; i++) {
            hasil = hasil * nilai;
        }
        System.out.println(nilai+" pangkat "+pangkat+" adalah "+hasil);
    }
}
