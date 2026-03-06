public class Book {
    String title;
    String author;
    int ISBN;

    public Book (String title, String author, int ISBN) {
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;

    }
    public void setTitle (String title) { // a set method
        this.title=title;

    }
    public String getTitle() {
        return this.title;
    }
    public void setAuthor(String author){
        this.author=author;

    }
    public String getAuthor() {
        return this.author;
    }
    public void setISBN (int ISBN) {
        this.ISBN=ISBN;

    }
    public int getISBN (){
        return this.ISBN;
    }
}



