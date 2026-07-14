class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : ₹" + price);
    }
}

public class BookStore {
    public static void main(String[] args) {

        Book b1 = new Book("Java Programming", "James Gosling", 650);
        Book b2 = new Book("Data Structures", "Mark Allen", 550);

        b1.display();
        System.out.println();

        b2.display();
    }
}