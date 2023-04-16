package UASno3;

public class Main {
    public static void main(String[] args){
        Belanja belanja = new Belanja();

        try{
            belanja.checkout();
        } catch(Exception e){
            System.out.println("Belanja Kosong!");
        }
    }
}
