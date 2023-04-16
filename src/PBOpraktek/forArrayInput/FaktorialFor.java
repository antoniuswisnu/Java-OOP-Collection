package PBOpraktek.forArrayInput;

public class FaktorialFor {
    public static void main (String [] args)
    {
        int nilai = 5;
        long hasil = 1;
        for (int i=1; i<= nilai; i++)
        {
            hasil = hasil * i;
        }
        System.out.println (nilai+" faktorial adalah "+hasil);
    }
}
