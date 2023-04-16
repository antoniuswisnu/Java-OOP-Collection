package UASno1;

public class Gelas {
    public int kapasitasTerisi;
    public int kapasitasUtama;

    public Gelas(int kapasitasTerisi, int kapasitasUtama){
        this.kapasitasTerisi = kapasitasTerisi;
        this.kapasitasUtama = kapasitasUtama;
    }

    public int getKapasitasTerisi() {
        return kapasitasTerisi;
    }

    public void setKapasitasTerisi(int kapasitasTerisi) {
        this.kapasitasTerisi = kapasitasTerisi;
    }

    public int getKapasitasUtama() {
        return kapasitasUtama;
    }

    public void setKapasitasUtama(int kapasitasUtama) {
        this.kapasitasUtama = kapasitasUtama;
    }

    void isiPenuh(){
        this.kapasitasTerisi = kapasitasUtama;
    }

    void tuang(Gelas tujuan){
        if(tujuan.kapasitasUtama - tujuan.kapasitasTerisi >= this.kapasitasTerisi){
            tujuan.kapasitasTerisi += this.kapasitasTerisi;
            this.kapasitasTerisi = 0;
        } else{
            int isi = tujuan.kapasitasUtama - tujuan.kapasitasTerisi;
            this.kapasitasTerisi -= isi;
            tujuan.kapasitasTerisi += isi;
        }
    }

    void buang(){
        this.kapasitasTerisi = 0;
    }

    @Override
    public String toString(){
        return "kapasitasTerisi: " + this.getKapasitasTerisi() + " kapasitasUtama: " + this.getKapasitasUtama();
    }



}
