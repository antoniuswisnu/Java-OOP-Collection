package PBOpraktek.tugasClass.problem2;

public class Main {
    public static void main(String[] args) {
        Student murid1 = new Student("ari", "S01");
        Student murid2 = new Student("ado", "S02");
        Student murid3 = new Student("boy", "S03");
        Student murid4 = new Student("cen", "S04");

        Subject dataSiswa1 = new Subject(murid1, 80, 60);
        Subject dataSiswa2 = new Subject(murid2, 100, 90);
        Subject dataSiswa3 = new Subject(murid3, 60, 50);
        Subject dataSiswa4 = new Subject(murid4, 80, 80);

        Report hasil = new Report();
        hasil.addStudent(dataSiswa1);
        hasil.addStudent(dataSiswa2);
        hasil.addStudent(dataSiswa3);
        hasil.addStudent(dataSiswa4);
        hasil.getRank();

        String hasilCari = hasil.searchStudent("ari");
        System.out.println(hasilCari);
    }
}
