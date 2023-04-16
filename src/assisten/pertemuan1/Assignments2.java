package assisten.pertemuan1;

public class Assignments2 {
    public static void main(String[] args) {
        int x = 30000000;
        int i = 3;

        if (i%2 == 0){
            System.out.println((x-0.2*x)/i);
        }else if (i%2 == 1){
            System.out.println((x-0.3*x)/i);
        }
    }

}
