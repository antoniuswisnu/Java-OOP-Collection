package PBOpraktek.Kuis;

import java.util.Scanner;

class Operasi {
    public int tambah(int x, int y){
        return x + y;
    }
}
class Penambah extends Operasi {

}

public class Main {
    public static void main(String[] args){

        Scanner myObj = new Scanner(System.in);
        int x = myObj.nextInt();
        int y = myObj.nextInt();

        Operasi a = new Operasi();

        System.out.println("My superclass is: " +   a.getClass().getSuperclass().getName());

        System.out.print(a.tambah(x,y));
    }
}

