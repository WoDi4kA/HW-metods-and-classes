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

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String toString() {
        return "The name of book is " + bookTitle + ". The Author of book is " + author + ". The year of release is " + releaseYear;
    }

    public boolean equals(Book other) {
        if (this.getBookTitle() != other.getBookTitle()) {
            return false;
        }
        Book TheLittlePrince = (Book) other;
        return bookTitle.equals(TheLittlePrince.bookTitle);
    }

    public int hashCode() {
        return java.util.Objects.hash(bookTitle);
    }

}




