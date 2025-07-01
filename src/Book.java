public class Book {
    private String bookTitle;
    private Author author;
    private int releaseYear;

    public Book(String name, Author author, int releaseYear) {
        this.bookTitle = name;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return  this.author;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}




