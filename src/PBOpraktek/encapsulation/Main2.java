package PBOpraktek.encapsulation;

public class Main2 {
    public static void main(String[] args){
        Account akun1 = new Account("wisnu","pass");
        akun1.name = "Antonius Wisnu";
//        akun1.password = "passganti123";
        System.out.println("nama modif: " + akun1.name);
        //System.out.println("nama modif: " + akun1.password);

        // CEK Class Book
        Book buku1 = new Book("little woman", "duck angel");
        buku1.borrowBook();
        buku1.returnBook();
        boolean status = buku1.isBookBorrowed();
        System.out.println("Status pinjaman buku: " + status);

        //CEK Class Person
        Person orang1 = new Person("wisnu", "331xxx");
        Person orang2 = new Person("wisnu", "333xxx");
        System.out.println("Cek apakah orang1 dan orang2 sama: "+orang1.isSamePerson(orang2));
//        String id1 = orang1.getId();
//        String id2 = orang2.getId();
//        if (id1.equals(id2)){
//            System.out.println("Kedua akun orangnya sama");
//        }
//        else{
//            System.out.println("Kedua akun orangnya beda");
//        }
//        System.out.println("id1: " + id1);
//        System.out.println("id2: " + id2);


    }
}
