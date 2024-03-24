package SingleResponsibilityPrinciple;

//import SingleResponsibilityPrinciple.Main.java;
public class Main {
    public static void main(String[] args) {
        // Create a Book
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger");

        // Save the Book to the database
        BookDatabase database = new BookDatabase();
        database.saveBook(book);

        // Load a Book from the database
        Book loadedBook = database.loadBook("The Catcher in the Rye");
        System.out.println("Loaded book: " + loadedBook.getTitle() + " by " + loadedBook.getAuthor());
    }
}