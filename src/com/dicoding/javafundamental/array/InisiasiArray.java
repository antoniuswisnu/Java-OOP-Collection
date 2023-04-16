package com.dicoding.javafundamental.array;

public class InisiasiArray {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5, 6};
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        /** Cara Kedua */

        int[] arrInt2 = new int[6];
        arrInt2[0] = 11;
        arrInt2[1] = 223;
        arrInt2[2] = 34;
        arrInt2[3] = 44;
        arrInt2[4] = 51;
        arrInt2[5] = 62;

        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);
    }
}
