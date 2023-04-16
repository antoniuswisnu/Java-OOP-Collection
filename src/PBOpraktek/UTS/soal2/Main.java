package PBOpraktek.UTS.soal2;

public class Main {
    public static void main(String[] args){
        Orang a = new Orang("Ayah Farhan", "KK1123_NID12345_0");
        Orang b = new Orang("Farhan", "KK1123_NID12346_2");
        Orang c = new Orang("Ayah Ninis", "KK2123_NID12347_0");
        Orang d = new Orang("Ninis", "KK2123_NID12349_2");

        System.out.println(a.getRelation(b));
        System.out.println(a.getRelation(c));
        System.out.println(b.getRelation(d));
    }
}
