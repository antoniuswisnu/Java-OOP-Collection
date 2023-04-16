package com.dicoding.javafundamental.perulangan;

public class Perpangkatan {
    public static void main (String[] args) {
        int nilai = 5;
        int awal = nilai;
        int pangkat = 3;
        int i = 1;
        double hasil = 0;

        while (i <= pangkat){
            hasil += nilai;
            i++;
        }
        System.out.println(hasil);
    }
}
