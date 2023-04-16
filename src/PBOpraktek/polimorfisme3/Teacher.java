package PBOpraktek.polimorfisme3;

public class Teacher extends Person{
    private int level;
    private int yearsOfExp;

    public Teacher(String name, String email, int level, int yearsOfExp){
        super(name, email);
        this.level = level;
        this.yearsOfExp = yearsOfExp;
    }

    @Override
    public String toString(){
        return "Nama: "+name+"\n"+
                "Email: "+email+"\n"+
                "Level: "+level+"\n"+
                "Tahun Pengalaman: "+yearsOfExp+"\n";
    }

}
