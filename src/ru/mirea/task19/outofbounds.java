package ru.mirea.task19;

public class outofbounds {
    static void throwOne() throws ArithmeticException {
        System.out.println("В теле метода throwOne()");
        throw new ArithmeticException("выход за границу");
    }
    public static void main(String[] args) {
       int x=110;
       if(x>100)
       {
           try {throwOne();}
           catch ( ArithmeticException e) {
           System.out.println("Перехвачено исключение: " + e);
       }
       }
    }
}
