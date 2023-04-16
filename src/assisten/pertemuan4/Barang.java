package assisten.pertemuan4;

public class Barang
{
    //    Attribute==================
    String id;
    int harga;
    int stok;
    int diskon;
    String nama;

    //    Constructor================
    Barang(String id, int harga, int stok, String nama) {
        this.id = id;
        this.harga = harga;
        this.stok = stok;
        this.nama = nama;
        this.diskon = 0;
    }

    //     Method===================
    boolean barangTersedia(){
        if(stok > 0) return true;
        else return false;
    }


}

