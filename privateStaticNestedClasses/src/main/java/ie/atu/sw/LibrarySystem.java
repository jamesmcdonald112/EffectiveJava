package ie.atu.sw;

// Public class - part of the public API
public class LibrarySystem {
    private static class BookHelper { // private static nested class
        // Package private access used as the class is private, this restricts access to the
        // method anyway.
        static boolean isRareBook(Book book) {
            return book.getPublicationYear() < 1900;
        }
    }

    public void checkBook(Book book) {
        if (BookHelper.isRareBook(book)) {
            System.out.println(book.getTitle() + " is a rare book");
        } else {
            System.out.println(book.getTitle() + " is not a rare book");
        }
    }
}
