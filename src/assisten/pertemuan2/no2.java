package assisten.pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no2 {
    public static void main(String[] args) {

        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));
        int nums[] = new int[10];
        String[] strNums = new String[0];

        System.out.print("Masukkan Angka:");

        try {
            strNums = bi.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < strNums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }

        boolean b = false;
        for (int i=0; i < (nums.length-2); i++) {
            int val = nums[i];

            if (nums[i + 1] == (val + 5) &&
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                b = true;
                break;
            }

        }

        System.out.println(b);
    }
}
