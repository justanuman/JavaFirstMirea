package ru.mirea.task4.task1AUTHOR;

public class TestAuthor {
    public static void main(String[] args)
    {
        Author a1 = new Author("David","Davidmail",'M');
        Author a2 = new Author("Janet","Janetmail",'F');
        Author a3 = new Author("Ben", "corrr",'M');
        a3.setEmail("Benmail");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}