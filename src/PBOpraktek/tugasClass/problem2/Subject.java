package PBOpraktek.tugasClass.problem2;

public class Subject {

    Student murid;
    int nilai, rank, nilaiBiologi, nilaiMatematika;

    Subject (Student murid, int nilaiMatematika, int nilaiBiologi){
        this.murid = murid;
        this.nilaiMatematika = nilaiMatematika;
        this.nilaiBiologi = nilaiBiologi;
        this.nilai = nilaiMatematika + nilaiBiologi;
    }
}
