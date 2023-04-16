package PBOpraktek.Kuis;

class Manager extends Pegawai{
    int y = 2000000;
    int getGajiPokok(){
        return y;
    }
}

class Pegawai{
    int x = 300000;
    int getGaji(){
        return x;
    }
}

public class NotMyMethod {
    public static void main(String []args){
        // Bagian ini tidak boleh diubah
        Manager a = new Manager();
        System.out.println("Gaji tunjangan: " + a.getGaji());
        System.out.println("Gaji pokok: " + a.getGajiPokok());
    }
}
