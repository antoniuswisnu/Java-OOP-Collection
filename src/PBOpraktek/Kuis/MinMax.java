package PBOpraktek.Kuis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMax {
    public static Integer findMin(ArrayList<Integer> data)
    {
        if (data == null || data.size() == 0) {
            return Integer.MAX_VALUE;
        }
        return Collections.min(data);
    }

    public static Integer findMax(ArrayList<Integer> data)
    {
        if (data == null || data.size() == 0) {
            return Integer.MIN_VALUE;
        }
        return Collections.max(data);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> data = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            data.add(a);
        }

        System.out.println(data.indexOf(findMin(data)) + " " + findMin(data));
        System.out.println(data.indexOf(findMax(data)) + " " + findMax(data));
    }

}
