package assisten.pertemuan2;

import java.util.Scanner;

public class Pola3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi = input.nextInt();

        for (int i = 0; i < tinggi; i++){
            int batas = 1;
            if (i < batas){
                System.out.println('*');
            }
            ++batas;
        }
    }
}
