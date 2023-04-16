package PBOpraktek.tugasClass.problem1;

public class Main {
    public static void main(String[] args){
        // membuat objek contact
        Contact contact1 = new Contact("Wisnu","antonius@mail.com","089812312312");
        Contact contact2 = new Contact("Wisnu2","antonius2@mail.com","089xxx");

        // membuat objek contactsManager
        ContactsManager bukuKontak = new ContactsManager();

        // penambahan contact ke contactsManager
        bukuKontak.addContact(contact1);
        bukuKontak.addContact(contact2);
        // bukuKontak.numContact(contact1);

        String hasilCari = bukuKontak.searchContact("Wisnu");
        System.out.println(hasilCari);
    }
}
