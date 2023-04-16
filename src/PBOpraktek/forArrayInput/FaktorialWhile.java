package PBOpraktek.forArrayInput;

public class FaktorialWhile {
    public static void main (String [] args)
    {
        int nilai = 5;
        long hasil=1;
        int i = 1;
        while ( i <= nilai)
        {
            hasil = hasil * i;
            i += 1;
        }
        System.out.println (nilai+" faktorial adalah "+hasil);
    }
}
