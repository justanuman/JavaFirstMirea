package ru.mirea.task10;
/*8. Палиндром
    Дано слово, состоящее только из строчных латинских букв. Проверьте,
    является ли это слово палиндромом. Выведите YES или NO.
    При решении этой задачи нельзя пользоваться циклами, в решениях на
    питоне нельзя использовать срезы с шагом, отличным от 1.*/
public class palindrom {
    public void palin (String pal)
    {
        int a=0;
        int b=pal.length();
        if (b==1)
        {
            System.out.print( "yes");
        }else{
            if (pal.charAt(a)!=pal.charAt(b-1))
            {
                System.out.print( "no");
            }else
            {
                if (b>3){
                palin(pal.substring(1,b-2));
                }else{
                    System.out.print( "yes");
                }
            }
        }
    }
    public static void main(String[]args)
    {
       palindrom word= new palindrom();
       word.palin("sas");
    }
}

