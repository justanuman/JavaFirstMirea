package ru.mirea.task10;
/*11. Количество единиц
    Дана последовательность натуральных чисел (одно число в строке),
    завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой
    последовательности встречается число 1. Числа, идущие после двух нулей,
    необходимо игнорировать.
    В этой задаче нельзя использовать глобальные переменные и параметры,
    передаваемые в функцию. Функция получает данные, считывая их с клавиатуры,
    а не получая их в виде параметров.
*/
import java.util.Scanner;

public class TaskEleven {
    public int cnt(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        if (num1 == 1) {
            int num2 = in.nextInt();
            if (num2 == 1) {return cnt() + num1 + num2;
            } else {
                int num3 = in.nextInt();
                if (num3 == 1) {return cnt() + num1 + num3;
                } else {return num1 + num2 ;}
            }
        } else {
            int num2 = in.nextInt();
            if (num2 == 1) {return cnt() + num1 + num2;
            } else if (num1==0&& num2==0) {return 0;}
            else{return cnt();}
        }
    }
    public static void main(String[]args)
    {
        TaskEleven obsidianFist = new TaskEleven();
        System.out.println(obsidianFist.cnt());
    }
}
