package ru.mirea.task17;
enum Car {
    ae86(), FC13, Verdeleon3, GTR

}
public class machineenum {
            public static void main(String[] args) {
                Car car;
                car = Car.ae86;
                System.out.println("Значение ap: " + car);
                System.out.println();
                car = Car.FC13;

                if (car == Car.GTR) System.out.println("GTR\n");
                switch (car) {
                    case ae86:
                        System.out.println("ae86");
                        break;
                    case FC13:
                        System.out.println("FC13");
                        break;
                    case Verdeleon3:
                        System.out.println(" Verdeleon3");
                        break;
                    case GTR:
                        System.out.println("GTR");
                        break;
                }
            }
        }