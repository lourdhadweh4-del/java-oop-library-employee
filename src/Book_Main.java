public class Book_Main {
    public static void main(String[] args) {

    }
    public void addBook (Book[] collection, Book newBook, int position) {
      collection [position] = newBook;

    }
    public void removeBook (Book [] collection, Book removeBook, int position) {
        collection [position] = null; //setting the position of the collection to null

    }
}
