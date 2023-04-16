package PBOpraktek.polimorfisme3;

public class Main {
    public static void main(String[] args){
        Student siswa = new Student("rian", "rian@gmail", 83.5, 2021);
        Teacher guru = new Teacher("wisnu", "wisnu@gmail", 3, 1);
        System.out.println("Membuat object menggunakan child class Student dan Teacher");
        System.out.println(siswa);
        System.out.println(guru);

        // make object with parent class type
        Person siswa2 = new Student("rian", "rian@gmail", 83.5, 2021);
        Person guru2 = new Teacher("wisnu", "wisnu@gmail", 3, 1);
        System.out.println("Membuat object menggunakan parent class Person");
        System.out.println(siswa2);
        System.out.println(guru2);

    }
}
