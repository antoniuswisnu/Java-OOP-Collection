package PBOpraktek.encapsulation;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    // getter
    public boolean isBookBorrowed(){
        return isBorrowed;
    }

    // setter
    public void borrowBook(){
        isBorrowed = true;
    }

    public void returnBook(){
        isBorrowed = false;
    }


}
