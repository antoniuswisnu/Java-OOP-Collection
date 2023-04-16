package assisten.tugaspertemuan6;

public class Employee extends Person {
    private String posisi;
    private double gaji;

    public Employee(String nama, int umur, char jenisKelamin, String posisi, double gaji) {
        super(nama, umur, jenisKelamin);
        this.posisi = posisi;
        this.gaji = gaji;
    }

    public String getPosisi() {
        return posisi;
    }

    public double getGaji() {
        return gaji;
    }

    public String toString(){
        return
                "Nama : " + getNama() + '\n' +
                "Umur : " + getUmur() + '\n' +
                "Jenis Kelamin : " + getJenisKelamin() + '\n' +
                "Posisi : " + getPosisi() + '\n' +
                "Gaji : " + getGaji() + '\n';

    }
}

