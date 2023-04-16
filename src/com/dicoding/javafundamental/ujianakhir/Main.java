package com.dicoding.javafundamental.ujianakhir;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        System.out.println(++a);
        System.out.println(b++);

        int c = 17;
        int d = 17;

        boolean result;
        result = c == d;

        System.out.println(result);

        char input = 'B';
        int output = 0;
        switch (input) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah: " + output);
    }


}
