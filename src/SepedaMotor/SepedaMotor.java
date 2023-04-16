package SepedaMotor;

public class SepedaMotor {
    private String merk;
    private int kecepatan;
    private double km;
    private double bensin;
    Orang pemilik;

    public SepedaMotor(String merk){
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getBensin() {
        return bensin;
    }

    public void setBensin(double bensin) {
        this.bensin = bensin;
    }

    public Orang getPemilik() {
        return pemilik;
    }

    public void setPemilik(Orang pemilik) {
        this.pemilik = pemilik;
    }

    public void jalan(){
        for(;;){
            System.out.println("Sedang jalan... km = " + getKm());
            if(getBensin() > 0){
                bensin -= 1;
                km += 0.1;
            }
            else{
                System.out.println("Bensin habis...");
            }
            // delay
            for(int i = 0; i<100000; i++){};
        }
    }


}
