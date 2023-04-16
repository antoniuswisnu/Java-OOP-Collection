package assisten.pertemuan2;

import java.util.Scanner;

public class JamPasir {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tinggi = input.nextInt();

        for(int i = 2; i <= tinggi; i++){
            for(int j = 1; j <= (tinggi*2)-1; j++){
                if(Math.abs(tinggi-j)<i){
                    System.out.print( '0' );
                }else{
                    System.out.print( ' ' );
                }
            }
            System.out.println();
        }
    }
}
