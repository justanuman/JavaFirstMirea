package ru.mirea.task4.task1;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String nam, String mail, char gen)
    {
        name= nam;
        email= mail;
        gender=gen;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public char getGender()
    {
        return gender;
    }
    public void setEmail(String email)
    {
        this.email= email;
    }
    public String toString(){
        return this.name+" "+this.gender +" at "+this.email;
    }
}
