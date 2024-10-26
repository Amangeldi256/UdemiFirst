package org.company.UdemiUrok.OOP.Fan;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(123, "OOP Oriented Programming", "Ranga");
        book.addReview(new Review(10, "Great Book", 5));
        book.addReview(new Review(24, "Awesome", 8));
        System.out.println(book);
    }
   
}
