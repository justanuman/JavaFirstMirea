package ru.mirea.task3.human;

public class Brain extends Human {
   int voltage=5;
    public Brain(int age, java.lang.String name, char gend){
       super( age,  name,  gend);}
    public void coma(){
        voltage=1;
    }
    public String toString(){
        return this.age+", name :"+this.name+" gend "+this.gend+" volt "+this.voltage;
    }
}
