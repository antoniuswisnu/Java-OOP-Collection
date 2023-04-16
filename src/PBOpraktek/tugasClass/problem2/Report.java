package PBOpraktek.tugasClass.problem2;

import java.util.Arrays;

public class Report {

    Subject [] arraySubject;
    int numStudent;
    int [] arrMurid;

    Report(){
        arrMurid = new int[4];
        numStudent = 0;
        arraySubject = new Subject[100];
    }

    void addStudent(Subject student){
        int n = numStudent;
        arraySubject[n] = student;
        numStudent += 1;
    }

    void getRank(){
        int n = numStudent;
        for(int i = 0; i < n; i++){
            arrMurid[i] = arraySubject[i].nilai;
        }
        Arrays.sort(arrMurid);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arrMurid[i] == arraySubject[j].nilai){
                    arraySubject[j].rank = 4 - i;
                }
            }
        }
    }

    String searchStudent(String nama){
        for (int i = 0; i < arraySubject.length; i++){
            if (arraySubject[i].murid.nama.equals(nama)){
                return toString(i);
            } else if (i >= 3) {
                return "Data tidak ditemukan!";
            }
        }
        return "0";
    }

    public String toString(int i) {
        return "Nama: " + arraySubject[i].murid.nama + "\n" +
                "Num: " + arraySubject[i].murid.num + "\n" +
                "Ranking: " + arraySubject[i].rank + "\n" +
                "Total Nilai: " + arraySubject[i].nilai;
    }
}
