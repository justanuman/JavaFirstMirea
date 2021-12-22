package ru.mirea.task23;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestHashCode {
    List<User> userList = new ArrayList<>();
    public boolean checkUser(String login,String password)
    {
        for (int i=0;i<5;i++)
        {
            if(login.hashCode()==userList.get(i).getLogin().hashCode() && password.hashCode()==userList.get(i).getPassword().hashCode())
                return true;
        }
        return false;
    }

    public static void main(String[] args){
        TestHashCode hash = new TestHashCode();
        hash.userList.add(new User("pain","password"));
        hash.userList.add(new User("hate","admin"));
        hash.userList.add(new User("anger","root"));
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++) {
            System.out.println("Хэш-код логина пользователя №"+i+": "+hash.userList.get(i).getLogin().hashCode());
            System.out.println("Хэш-код пароля пользователя №"+i+": "+hash.userList.get(i).getPassword().hashCode());
        }
        String login = null,password = null;
        System.out.println("Логин: ");
        login=sc.next();
        System.out.println("Хэш-код логина: "+login.hashCode());
        System.out.println("Пароль: ");
        password=sc.next();
        System.out.println("Хэш-код пароля: "+password.hashCode());
        while(!hash.checkUser(login, password))
        {
            System.out.println("Неверный логин или пароль");
            System.out.println("Логин: ");
            login=sc.next();
            System.out.println("Хэш-код логина: "+login.hashCode());
            System.out.println("Пароль: ");
            password=sc.next();
            System.out.println("Хэш-код пароля: "+password.hashCode());
        }
        System.out.println("welcome");
    }
}