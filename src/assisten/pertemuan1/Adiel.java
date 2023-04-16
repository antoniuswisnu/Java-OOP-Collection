//package assisten.pertemuan1;
//
//import java.util.Scanner;
//
//public class Adiel {
//    public static void main(String[] args) {
//        String nama, mata_pelajaran, sikap;
//        double nilai_akhir, poin;
//        int  nilai_tugas;
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Nama: ");
//        nama = scan.nextLine();
//
//        System.out.print("Mata Pelajaran: ");
//        mata_pelajaran = scan.nextLine();
//
//        System.out.print("Sikap: ");
//        sikap = scan.nextLine();
//
//        System.out.print("Nilai tugas: ");
//        nilai_tugas = scan.nextInt();
//
//        //Algorithm
//        poin = switch (sikap) {
//            case "sangat baik" -> 0.2;
//            case "baik" -> 0.1;
//            case "buruk" -> -0.1;
//            case "sangat buruk" -> -0.2;
//            default -> 0.0;
//        };
//        double nilai = nilai_tugas + nilai_tugas * poin;
//        nilai_akhir = nilai <= 100 ? nilai : 100;
//
//        System.out.println("Nama : "+nama);
//        System.out.println("Mata Pelajaran : "+mata_pelajaran);
//        System.out.println("Sikap : "+sikap);
//        System.out.println("Nilai Tugas : "+(double)nilai_tugas);
//        System.out.println("Nilai Akhir : "+nilai_akhir);
//    }
//}
