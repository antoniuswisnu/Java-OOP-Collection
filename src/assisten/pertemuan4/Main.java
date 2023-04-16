package assisten.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Barang barang1 = new Barang("1",3000,5,"Apel");
        Barang barang2 = new Barang("2",4000,2,"Semangka");
        Barang barang3 = new Barang("3",5000,0,"Jeruk");

        Minimarket listBarang = new Minimarket();
        listBarang.tambahBarang(barang1);
        listBarang.tambahBarang(barang2);
        listBarang.tambahBarang(barang3);

        listBarang.tampilBarang();

        System.out.println();

        listBarang.cekKetersediaanBarang("3");
        listBarang.cekKetersediaanBarang("2");

        System.out.println();

        listBarang.perluRestockBarang();

        listBarang.cariBarang("durian");
        listBarang.cariBarang("ApeL");

    }
}
