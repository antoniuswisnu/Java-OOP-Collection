package assisten.pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];
        String[] listNama = new String[n];
        String[] listIstriIndonesia = new String[n];
        String[] listIstriKorea = new String[n];
        String[] listIstriRussia = new String[n];

        System.out.print("Masukkan Angka:");

//        try {
////            listNama = bi.readLine().split(" ");
////            listIstriIndonesia = bi.readLine().split(" ");
////            listIstriKorea = bi.readLine().split(" ");
////            listIstriRussia = bi.readLine().split(" ");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        for (int i = 0; i < nums.length; i++) {
            listNama = bi.readLine().split(",");
        }

        System.out.println(listNama[2]);

    }
}
