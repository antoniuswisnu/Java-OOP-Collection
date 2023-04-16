package PBOpraktek.forArrayInput;

public class Ganjil {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0){
                System.out.println(data[i]);
            }
        }
    }
}
