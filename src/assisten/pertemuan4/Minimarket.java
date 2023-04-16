package assisten.pertemuan4;

import java.util.ArrayList;
import java.util.Objects;

public class Minimarket {
    //    Attribute=============
    ArrayList<Barang> listBarang;
    String nama;

    //    Constructor===========
    Minimarket(){
        listBarang = new ArrayList<>();
    }
    Minimarket(String nama){
        this.nama = nama;
        listBarang = new ArrayList<>();
    }

    //    Method==============
    void tampilBarang(){
        for (Barang barang : listBarang){
            System.out.println(barang.nama);
        }
    }

    void tambahBarang(Barang barang){
        this.listBarang.add(barang);
    }

    void cekKetersediaanBarang(String id){
        for(Barang barang : listBarang){
            if(Objects.equals(barang.id, id)){
                if(barang.barangTersedia()) {
                    System.out.println(barang.nama + " Barang Tersedia!");
                    break;
                }else{
                    System.out.println(barang.nama + " Barang Habis!");
                    break;
                }
            }
        }
    }

    void perluRestockBarang(){
        for(Barang barang : listBarang){
            if(!barang.barangTersedia()) {
                System.out.print(barang.nama + " Perlu Di Restock");
                System.out.println();
            } else {
                System.out.println(barang.nama + " Tidak Perlu di Restock");
            }
        }
    }

    void cariBarang(String keyword){
        keyword = keyword.toLowerCase();
        for(Barang barang : listBarang){
            if(keyword.contains(barang.nama.toLowerCase())) {
                System.out.print(keyword + " Ada");
                break;
            } else {
                System.out.println(keyword + " Tidak Ada");
                break;
            }
        }
    }
}

