package PBOpraktek.percabangan;

public class IfBersarang {
    public static void main (String [] args)
    {
        int belanja = 90000;
        int diskon = 0;
        if ( belanja >100000)
        {diskon = belanja/10;}
        else if ( belanja>75000)
        {diskon = belanja*8/100;}
        else if ( belanja >50000)
        {diskon = belanja*5/100;}
        else if ( belanja >25000)
        {diskon = belanja*3/100;}
        else
        {diskon = 0;}
        System.out.println("diskon = "+diskon);

        int nilai = 39;
        if ( nilai >= 90)
        {System.out.println("A");}
        else if ( 80 <= nilai )
        {System.out.println("B");}
        else if ( 60 <= nilai )
        {System.out.println("C");}
        else if ( 40 <= nilai )
        {System.out.println("D");}
        else if ( nilai <= 40)
        {System.out.println("E");}
    }
}
