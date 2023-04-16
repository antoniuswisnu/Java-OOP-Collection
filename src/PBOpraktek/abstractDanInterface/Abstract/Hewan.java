package PBOpraktek.abstractDanInterface.Abstract;

abstract class Hewan{
    protected String nama;
    protected int jumKaki;
    protected Boolean bisaTerbang = false;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Hewan(String nama, int kaki, Boolean terbang){
        this.nama = nama;
        jumKaki = kaki;
        bisaTerbang = terbang;
    }
    public abstract void bersuara();

    public static void makan(){
        System.out.println("nyam, nyam, nyam");
    }

    public void isHewan(){
        System.out.println("nama : "+nama);
        System.out.println("jumlah kaki : "+jumKaki);
        System.out.println("bisa terbang : "+bisaTerbang);
    }
}
