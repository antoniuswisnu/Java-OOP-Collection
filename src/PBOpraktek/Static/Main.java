package PBOpraktek.Static;

public class Main {
    public static void main(String[] args){
        for(int i = 0; i<5; i++){
            Person orang = new Person();
            System.out.println(orang.count);
        }

        int hasil = Calculator.add(5,10);
        int hasil2 = Calculator.subtract(5,10);
        System.out.println("Hasil Jumlah: " + hasil);
        System.out.println("Hasil Jumlah: " + hasil2);
    }
}
