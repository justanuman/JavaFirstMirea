package ru.mirea.task1.opt1;
public class TaskFive {
    public int fak(int a){
        int res=1;
        while(a>1){
            res*=a;
            a-=1;
        }
        return res;
    }
    public static void main(String[] args){
        TaskFive indomitableWill= new TaskFive();
        System.out.println(indomitableWill.fak(5));
    }
}
