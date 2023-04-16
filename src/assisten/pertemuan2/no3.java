package assisten.pertemuan2;

import java.util.Scanner;

public class no3 {

    public static void main(String[] args) {
        StringBuilder hasil = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++){
            if (i == 0 && str.charAt(0) == 'a') {
                hasil.append(str.charAt(i));
            } else if (i == str.length()-1 && str.charAt(str.length()-1) == 'a'){
                hasil.append(str.charAt(i));
            }else if (str.charAt(i) == 'a'){
                continue;
            }  else {
                hasil.append(str.charAt(i));
            }
        }
        System.out.println(hasil);
    }

}
