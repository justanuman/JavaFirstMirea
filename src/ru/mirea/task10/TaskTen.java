package ru.mirea.task10;
/*0. Разворот числа
    Дано число n, десятичная запись которого не содержит нулей. Получите
    число, записанное теми же цифрами, но в противоположном порядке.
    При решении этой задачи нельзя использовать циклы, строки, списки,
    массивы, разрешается только рекурсия и целочисленная арифметика.
    Функция должна возвращать целое число, являющееся результатом работы
    программы, выводить число по одной цифре нельзя.*/
public class TaskTen {
    public int revers(int n, int a)
    {
        if (n==0)
    {
        return a;
    }else {
        return revers(n/10,a*10+n%10);
    }
    }
    public static void main(String[]args)
    {
        TaskTen steadfastResolve = new TaskTen();
        System.out.println(steadfastResolve.revers(12345,0));
    }
    }

