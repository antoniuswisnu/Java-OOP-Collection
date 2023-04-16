//package assisten.pertemuan7;
//
//public class KaryawanKeuangan extends Karyawan{
//    private Manager posisiManager;
//    private Staff posisiStaff;
//    private double nilaiSkill;
//
//    public KaryawanKeuangan(String nama, int usia, Departemen departemen, Manager posisiManager, Staff posisiStaff, double nilaiSkill) {
//        super(nama, usia, departemen);
//        this.posisiManager = posisiManager;
//        this.posisiStaff = posisiStaff;
//        this.nilaiSkill = nilaiSkill;
//    }
//
//    public double hitungGaji() {
//        double gaji = departemen.getGajiDasar() + departemen.hitungTunjangan();
//        if (posisiManager != null) {
//            gaji += posisiManager.hitungNilaiTunjangan();
//        }
//        if (posisiStaff != null) {
//            gaji += posisiStaff.hitungNilaiTunjangan();
//        }
//        gaji += nilaiSkill * 100000;
//        return gaji;
//    }
//}
