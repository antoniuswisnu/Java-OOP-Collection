package HackerRank;

import java.util.Scanner;

public class StaticInitializerBlock {

    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = true;
    static{
        try{
            if(B <= 0 || H <= 0){
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        if(flag){
            int area= B * H;
            System.out.print(area);
        }
//        else {
//            System.out.println("java.lang.Exception: Breadth and height must be positive");
//        }
    }//end of main

}//end of class


