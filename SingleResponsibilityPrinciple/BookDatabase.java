package SingleResponsibilityPrinciple;

//package SIngleResponsibility Principle;

public class BookDatabase {
    public void saveBook(Book book) {
        
        System.out.println("Saving book: " + book.getTitle());
    }

    public Book loadBook(String title) {
        System.out.println("Loading book: " + title);
        return new Book(title, "Dummy Author");
    }
}
