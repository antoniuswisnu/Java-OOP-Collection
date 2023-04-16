package PBOpraktek.forArrayInput;

public class ArrayJumlahFor {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        double hasil = 0;
        for (int i = 0; i < data.length; i++) {
            hasil += data[i];
        }
        System.out.println(hasil);
    }
}
