package PBOpraktek.belajarClass;

class Lingkaran {

    double jari2;

    public Lingkaran (double jari2){
        this.jari2 = jari2;
    }
    public double getKeliling(){
        return 2 * 3.14 * jari2;
    }
    public double getLuas(){
        return 3.14 * jari2 * jari2;
    }

    public String toString(){
        return "Lingkaran berjari-jari = " + this.jari2 +"\n" +
        "keliling = " + this.getKeliling() + "\n" +
        "luas = " + this.getLuas();
    }
}
