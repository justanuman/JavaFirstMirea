package ru.mirea.task3.book;

public class Book {
    private String name;
    private int sizeOfBook;
    private String author;
    private int ageOfBook;
    public Book(String n,String aut, int a,int b)
    {
        name =n;
        author= aut;
        sizeOfBook=a;
        ageOfBook=b;
    }
    public Book(String n,String aut)
    {
        name =n;
        author= aut;
        sizeOfBook=0;
        ageOfBook=0;
    }
    public Book(int s)
    {
        name ="unknown";
        author= "unknown";
        sizeOfBook=s;
        ageOfBook=0;
    }
    public Book()
    {
        name ="unknown";
        author= "unknown";
        sizeOfBook=0;
        ageOfBook=0;
    }
    public void setSize(int age) {
        this.sizeOfBook = age;
    }
    public void setAgeOfBook(int ageOfBook) {this.ageOfBook = ageOfBook;}
    public void setSizeOfBook(int sizeOfBook) {this.sizeOfBook = sizeOfBook;}

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeOfBook() {
        return ageOfBook;
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
        return this.name+", author:"+this.author +", length: "+this.sizeOfBook +" Age:"+ this.ageOfBook;
    }
}
