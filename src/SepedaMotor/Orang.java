package SepedaMotor;

public class Orang {
    private String nama;
    private String alamat;
    private String KTP;
    SepedaMotor [] listSepeda;
    private int jumlah_motor;


    public Orang(String nama, String alamat, String KTP){
        this.nama = nama;
        this.alamat = alamat;
        this.KTP = KTP;
        jumlah_motor = 0;
        listSepeda = new SepedaMotor[10];
    }

    public String getNama(){
        return nama;
    }

    public void beli_motor(double harga, SepedaMotor spd){
        listSepeda[jumlah_motor] = spd;
        jumlah_motor++;
        System.out.println(nama + " Membeli sepdea motor " +
                spd.getMerk() + " seharga Rp" + harga);
    }

    public void daftar_motor(){
        System.out.println("Motornya " + nama + " :");
        for(int i = 0; i<jumlah_motor; i++){
            System.out.println(listSepeda[i].getMerk());
        }

    }





}
