package assisten.pertemuan1;

public class Task4 {
    public static void main(String[] args) {
        int nilai = 5;

        if (nilai >= 90){
            System.out.println("A");
        } else if (nilai >= 80 && nilai < 90){
            System.out.println("B");
        } else if (nilai >= 60 && nilai < 80){
            System.out.println("C");
        } else if (nilai >= 40 && nilai < 60){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}
