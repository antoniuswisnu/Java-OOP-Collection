package PBOpraktek.forArrayInput;

public class PanjangPendek {
    public static void main(String[] args) {
        String kata = "Namaku";
        int counter = 0;
        for (int i = 0; i < kata.length(); i++){
            counter++;
        }
        if (counter > 10){
            System.out.println("Panjang");
        } else {
            System.out.println("Pendek");
        }
    }
}
