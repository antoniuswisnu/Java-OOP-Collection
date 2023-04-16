package assisten.pertemuan1;

public class Assignments1 {
    public static void main(String[] args) {

        double uang = 500000.0;
        double uang2 = uang - 200000.0;
        double diskon = uang2 - ((50.0/100.0) * uang2);
        System.out.println(diskon);

        double makanan = 150000;
        double uang3 = diskon - (makanan * 4);

        if (uang3 == 0){
            System.out.println("Uang Aji Habis");
        } else if (uang3 > 0){
            System.out.println("Uang Aji Sisa " + uang3);
        } else if (uang3 < 0){
            System.out.println("Uang Aji Kurang " + uang3);
        }
    }


}
