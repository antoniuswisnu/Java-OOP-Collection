package PBOpraktek.UTS.soal2;

public class Orang {
    String nama;
    private final String NIK;
    String keluarga;
    char Cekstatus;
    String Status;

    public Orang(String nama, String NIK){
        this.nama = nama;
        this.NIK = NIK;

        this.keluarga = NIK.substring(0,5);
        this.Cekstatus = NIK.charAt(16);
        if (Cekstatus == '0'){
            this.Status = "Kepala Keluarga";
        }else if(Cekstatus == '1'){
            this.Status = "Istri";
        }else if(Cekstatus == '2') {
            this.Status = "Anak";
        }
    }

    public String getRelation(Orang hubungan){

        if (this.keluarga.equals(hubungan.keluarga)){
            return this.nama+ ": "+this.Status+"\n"+
                    hubungan.nama+": "+hubungan.Status+"\n"+
                    "============================";
        }else{
            return this.nama +" dan "+ hubungan.nama+ " Tidak ada hubungan"+"\n"+
                    "============================";
        }

    }



}
