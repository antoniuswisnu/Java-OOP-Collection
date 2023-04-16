package PBOpraktek.forArrayInput;

public class FaktorialDoWhile {
    public static void main (String [] args)
    {
        int nilai = 5;
        long hasil=1;
        int i = 1;
        do {
            hasil = hasil * i;
            i += 1;
        } while (i <= nilai);
        System.out.println (nilai+" faktorial adalah "+hasil);
    }
}
