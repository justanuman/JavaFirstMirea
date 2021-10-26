package ru.mirea.task13;
import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("твердое");
        states.add("жидкое");
        states.add("газообразное");
        states.add(1, "плазма");

        System.out.println(states.get(1));
        //states.set(1, "аморфное");
        System.out.printf("В списке %d элемента \n", states.size());

        for(String state : states){
            System.out.println(state);
        }
        System.out.println("_______________");
        states.remove("жидкое");
        states.remove(0);
        System.out.printf("В списке %d элемента \n", states.size());
        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        if(states.contains("твердое")){
            System.out.println("массив твердый");
        }
}}}
