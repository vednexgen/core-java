package org.nexgen.this_and_static.this_keyword;

class Book {
    String title;
    double price;

    Book() {
        this("Unknown", 0.0);  // Calls parameterized constructor
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Book: " + title + ", Price: " + price);
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", 499);
        b1.display();
        b2.display();
    }
}