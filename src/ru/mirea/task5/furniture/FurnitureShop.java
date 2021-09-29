package ru.mirea.task5.furniture;
import java.util.Scanner;
public class FurnitureShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Chair or table");
        String name = in.nextLine();
        switch (name)
        {
            case "Table":
                System.out.print("size");
                String size = in.nextLine();
                System.out.print("leg number");
                int leg = in.nextInt();
                Furniture t1= new Table(size,leg,"steel");
                System.out.println(t1);
                break;
            case "Chair":
                System.out.print("size");
                String siz = in.nextLine();
                System.out.print("spine hardness");
                String spine = in.nextLine();
                System.out.print("material");
                String mate = in.nextLine();
                Furniture t2= new Chair(siz,spine,mate);
                System.out.println(t2);
                break;
        }
    }
}
