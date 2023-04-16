package PBOpraktek.polimorfisme3;

public class Student extends Person {
    private double grade;
    private int year;

    public Student(String name, String email, double grade, int year){
        super(name, email);
        this.grade = grade;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Nama: "+name+"\n"+
                "Email: "+email+"\n"+
                "Nilai: "+grade+"\n"+
                "Tahun masuk: "+year+"\n";
    }

}
