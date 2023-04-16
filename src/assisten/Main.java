package assisten;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        StringBuilder word = new StringBuilder (scan.next());
        int panjang = word.length();

        for (int i = 1; i < panjang - 1; i++) {
            if (word.charAt(i) == 'a') {
                word = word.deleteCharAt(i);
                i--;
                panjang--;
            }
        }

        System.out.println(word);

    }
}
