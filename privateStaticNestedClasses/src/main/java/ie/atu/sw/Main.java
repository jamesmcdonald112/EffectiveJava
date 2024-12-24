package ie.atu.sw;

public class Main {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        Book book = new Book("Pride and Prejudice", 1813);
        librarySystem.checkBook(book);
    }
}
