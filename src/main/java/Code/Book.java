package Code;

public class Book {
    private String isbn;
    private String damaged;
    private String title;

    public Book(String isbn, String damaged, String title) {
        this.isbn = isbn;
        this.damaged = damaged;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", damaged=" + damaged + ", title=" + title + '}';
    }
}
