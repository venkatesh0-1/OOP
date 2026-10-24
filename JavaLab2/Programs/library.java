class Book {
    int bookId;
    String title;
    String author;
    double price;

    static int count = 0;

    Book(int id, String t, String a, double p) {
        bookId = id;
        title = t;
        author = a;
        price = p;
        count++;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    void search(int id) {
        if (bookId == id)
            display();
    }

    void search(String t) {
        if (title.equalsIgnoreCase(t))
            display();
    }

    Book compare(Book b) {
        if (price > b.price)
            return this;
        else
            return b;
    }
}

public class library {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", "James", 450);
        Book b2 = new Book(102, "Python", "Guido", 600);
        Book b3 = new Book(103, "C Programming", "Dennis", 300);

        System.out.println("All Books:");
        b1.display();
        b2.display();
        b3.display();

        System.out.println("\nSearch by Book ID:");
        b1.search(101);

        System.out.println("\nSearch by Title:");
        b2.search("Python");

        System.out.println("\nCostlier Book:");
        Book costly = b1.compare(b2);
        costly.display();

        System.out.println("\nTotal Books Created: " + Book.count);
    }
}