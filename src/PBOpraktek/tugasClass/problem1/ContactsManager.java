package PBOpraktek.tugasClass.problem1;

public class ContactsManager {

    Contact [] arrayContact;
    int numContact;

    ContactsManager(){
        arrayContact = new Contact[1000];
        numContact = 0;
    }

    void addContact(Contact kontak){
        int n = numContact;
        arrayContact[n] = kontak;
        numContact += 1;
    }

    String searchContact(String nama){
        int n = numContact;
        for (int i = 0;i < n; i++){
            if (arrayContact[i].nama.equals(nama)){
                return arrayContact[i].telepon;
            }
        }
        return "Kontak tidak ditemukan!";
    }
}

