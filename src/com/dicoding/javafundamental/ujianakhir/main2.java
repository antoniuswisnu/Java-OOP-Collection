package com.dicoding.javafundamental.ujianakhir;

public class main2 {
    public static void main(String[] args) {
        int input = 3;
        switch (input){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                break;
        }
        boolean menyala = false;

        if (menyala) {
            System.out.println("Menyalakan lampu");
        } else {
            System.out.println("Kondisi tidak terpenuhi...");
        }
        double a = 3.14;
        String hasil = String.valueOf(a);
        System.out.println(hasil);
    }

}
