package assisten.tugaspertemuan6;

public class Person {
    private String nama;
    private int umur;
    private char jenisKelamin;

    public int getUmur() {
        return umur;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public Person(String nama, int umur, char jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

}
