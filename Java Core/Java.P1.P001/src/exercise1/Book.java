package exercise1;


public class Book {
    private String bookName;
    private int number;
    private String authorName;
    private String publisher;

    public Book() {
    }

    public Book(String bookName, int number, String authorName, String publisher) {
        this.bookName = "NULL";
        this.number = 0;
        this.authorName = "NULL";
        this.publisher = "NULL";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void getBookInfo() {
        System.out.printf(toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", number=" + number +
                ", authorName='" + authorName + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

class BookTest {
    public static void main(String[] args) {
        Book test[] = new Book[30];
        test[1] = new Book();
        test[1].getBookInfo();
        test[1].setAuthorName("FPT"); // test getter setter
    }
}
