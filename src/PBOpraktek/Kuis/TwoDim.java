package PBOpraktek.Kuis;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> data = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            data.add(a);
        }
        int x = -10;
        for(int j = 0; j < n; j++){
            x += 10;
            System.out.print(data.get(j) + x + " ");
        }
    }
}
