package assisten.pertemuan1;

import java.util.Objects;
import java.util.Scanner;

public class Assignment32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Mata Pelajaran : ");
        String mata_pelajaran = sc.nextLine();
        System.out.print("Sikap : ");
        String sikap = sc.nextLine();
        System.out.print("Nilai : ");
        double nilai = sc.nextInt();
        double nilai_akhir = 0;

        switch (sikap){
            case "sangat baik":
                nilai_akhir = nilai + (0.2 * nilai);
                break;
            case "baik":
                nilai_akhir = nilai + (0.1 * nilai);
                break;
            case "buruk":
                nilai_akhir = nilai - (0.1 * nilai);
                break;
            case "sangat buruk":
                nilai_akhir = nilai - (0.2 * nilai);
                break;
            default:
                nilai_akhir = nilai;
        }

        if (nilai_akhir > 100){
            nilai_akhir = 100;
        }

        System.out.println("Rekap Nilai Murid #1");
        System.out.println("################");
        System.out.println("Nama : " + nama);
        System.out.println("Mata Pelajaran : " + mata_pelajaran);
        System.out.println("Sikap : " + sikap);
        System.out.println("Nilai Tugas : " + nilai);
        System.out.println("Nilai Akhir : " + nilai_akhir);
        System.out.println("################");
    }
}
