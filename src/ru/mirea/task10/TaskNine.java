package ru.mirea.task10;
/*9. Без двух нулей
    Даны числа a и b. Определите, сколько существует последовательностей
    из a нулей и b единиц, в которых никакие два нуля не стоят рядом.
*/
public class TaskNine {
    public int zero(int a, int b)
    {
        if (a==0)
        {return 1;}
        else if (a==1)
        {
            return b+1;
        }
        else if (b==0 && a>1)
        {
            return 0;
        }else
        if (a>1 || b>1){return  zero(a - 1, b - 1) + zero(a, b - 1);}
        return 0;
        }
    public static void main(String[]args)
    {
        TaskNine litanyOfFury = new TaskNine();
        System.out.println(litanyOfFury.zero(2,1));
    }
    }
