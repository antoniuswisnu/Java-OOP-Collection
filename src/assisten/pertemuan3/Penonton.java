package assisten.pertemuan3;

public class Penonton {
    String nama;
    String nomorIdentitas;
    char jenisKelamin;

    public Penonton(String nama, String nomorIdentitas, char jenisKelamin) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.jenisKelamin = jenisKelamin;
    }

    public String toString() {
        return
                "Nama = '" + nama + '\'' +
                ", Nomor Identitas = '" + nomorIdentitas + '\'' +
                ", Jenis Kelamin = " + jenisKelamin
             ;
    }
}
