package HackerRank;

import java.util.Scanner;

public class EOF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        for(int i = 1; sc.hasNext(); System.out.println(i++ + " " + sc.nextLine()));
        int i = 0;
        while(sc.hasNext()){
            i++;
            String a = sc.nextLine();
            System.out.println(i + " " + a);
        }
    }
}
