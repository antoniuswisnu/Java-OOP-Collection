package assisten.tugaspertemuan6;

public class Engineer extends Employee {
    private double tunjanganInsinyur;
    private int jumlahProjek;

    public Engineer(String name, int age, char gender, String posisi, double gaji, double tunjanganInsinyur, int jumlahProjek) {
        super(name, age, gender, posisi, gaji);
        this.tunjanganInsinyur = tunjanganInsinyur;
        this.jumlahProjek = jumlahProjek;
    }

    public double getTunjanganInsinyur() {
        return tunjanganInsinyur;
    }

    public int getJumlahProjek() {
        return jumlahProjek;
    }

    public String toString(){
        return
                "Nama : " + getNama() + '\n' +
                "Umur : " + getUmur() + '\n' +
                "Jenis Kelamin : " + getJenisKelamin() + '\n' +
                "Posisi : " + getPosisi() + '\n' +
                "Gaji : " + getGaji() + '\n' +
                "Tunjangan Insinyur : " + getTunjanganInsinyur() + '\n' +
                "Jumlah Projek : " + getJumlahProjek() + '\n';

    }

}
