package ru.mirea.task1.opt1;
/*мне не хотелось делать отдельный класс ради 1 абзаца так что у меня всё в одном методе
* тк метод фор вычитает то если хотьт один из низ не работает то это заметно (они все работают)*/
import ru.mirea.task2.book.Book;

public class TaskOne {
    public int sum(int [] a)
    {
        int res =0;
        int i=0;
        while(i<a.length)
        {
            res+=a[i];
            i++;
        }
        for (i=0; i<a.length; i++)
        {
            res-=a[i];
        }
        i=0;
        do{
            res+=a[i];
            i++;
        }while(i<a.length);
        return res;
    }
    public static void main(String[] args)
    {
        TaskOne eternalService = new TaskOne();
        int [] a = {2,1,1};
        System.out.println(eternalService.sum(a));
    }
}
