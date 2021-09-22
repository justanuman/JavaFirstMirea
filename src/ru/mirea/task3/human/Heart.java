package ru.mirea.task3.human;

public class Heart extends Human {
    int bpm=60;
    public Heart(int age, java.lang.String name, char gend) {
        super(age, name, gend);
    }
    public void stop(){
        bpm=0;
    }
    public String toString(){
        return this.age+", name :"+this.name+" gend "+this.gend+"bpm "+this.bpm;
    }
}
