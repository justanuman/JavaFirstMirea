package ru.mirea.task3.book;

public class BookTest {
    public static void main(String[] args)
    {
        Book b1 = new Book("Bible","god",150,2021);
        Book b2 = new Book("dictionary","Dal");
        Book b3 = new Book(24);
        b3.setName("method");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
