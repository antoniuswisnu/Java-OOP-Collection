package PBOpraktek.UTS.soal1;

public class Pegawai {
    private String nama;
    private String divisi;

    public Pegawai(String nama, String divisi, String posisi){
        this.nama = nama;
        this.divisi = divisi;
        this.posisi = posisi;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    private String posisi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public double getGaji(){
        if(getDivisi() == "Front-End"){
            if(getPosisi() == "Intern"){
                return 600000;
            } else if(getPosisi()== "Programmer"){
                return 3000000;
            }
        } else if (getDivisi() == "Back-End"){
            if(getPosisi() == "Intern"){
                return 750000;
            } else if(getPosisi() == "Programmer"){
                return 4000000;
            }
        }
        return 0;
    }


    public String toString(){
        return "Nama: " + getNama() + "\n" +
                "Divisi: " + getDivisi() + "\n" +
                "Posisi: " + getPosisi() + "\n" +
                "Gaji: Rp" + getGaji() + "\n" +
                "==============================";
    }

}
