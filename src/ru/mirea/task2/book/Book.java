package ru.mirea.task2.book;

public class Book {
    private String name;
    private int sizeOfBook;
    private String author;
    public Book(String n,String aut, int a)
    {
        name =n;
        author= aut;
        sizeOfBook=a;
    }
    public Book(String n,String aut)
    {
        name =n;
        author= aut;
        sizeOfBook=0;
    }
    public Book(int s)
    {
        name ="unknown";
        author= "unknown";
        sizeOfBook=s;
    }
    public Book()
    {
        name ="unknown";
        author= "unknown";
        sizeOfBook=0;
    }
    public void setSize(int age) {
        this.sizeOfBook = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public void setAuthor(String author) {this.author = author;}
    public String getAuthor(){return this.author;}
    public int getSize() {
        return sizeOfBook;
    }
    public String toString(){
        return this.name+", author:"+this.author +", length: "+this.sizeOfBook;
    }
}
