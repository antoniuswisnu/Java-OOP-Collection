package assisten.pertemuan2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class fajar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int negara = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        ArrayList<Integer> index_istri = new ArrayList<Integer>();
        String substring = scanner.nextLine();
        String[] splitted_substring = substring.split(", ");


        for (int i = 0; i < negara; i++){
            String calon = scanner.nextLine();
            String[] splitted_calon = calon.split(", ");
            isFound = false;
            for (int j = 0; j < splitted_calon.length; j++){
                for (int k = 0; k < splitted_substring.length; k++){
                    if (splitted_calon[j].contains(splitted_substring[k])){
                        index_istri.add(j);
                        isFound = true;
                        break;
                    }
                }
                if (isFound){
                    break;
                }
            }
        }
        System.out.println(index_istri);
    }
}