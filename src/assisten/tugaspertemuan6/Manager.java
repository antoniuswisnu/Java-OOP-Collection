package assisten.tugaspertemuan6;

public class Manager extends Employee {
    private double tunjanganPosisi;
    private double tunjanganKinerja;

    public Manager(String nama, int umur, char jenisKelamin, String posisi, double gaji, double tunjanganPosisi, double tunjanganKinerja) {
        super(nama, umur, jenisKelamin, posisi, gaji);
        this.tunjanganPosisi = tunjanganPosisi;
        this.tunjanganKinerja = tunjanganKinerja;
    }

    public double getTunjanganPosisi() {
        return tunjanganPosisi;
    }

    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }

    public String toString(){
        return
                "Nama : " + getNama() + '\n' +
                "Umur : " + getUmur() + '\n' +
                "Jenis Kelamin : " + getJenisKelamin() + '\n' +
                "Posisi : " + getPosisi() + '\n' +
                "Gaji : " + getGaji() + '\n' +
                "Tunjangan Posisi : " + getTunjanganPosisi() + '\n' +
                "Jumlah Kinerja : " + getTunjanganKinerja() + '\n';

    }

}

