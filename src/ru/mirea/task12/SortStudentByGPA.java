package ru.mirea.task12;
import java.util.Arrays;

public class SortStudentByGPA implements ru.mirea.task12.Comparator {
    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (arr[j] >= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
        return i+1;
    }
    @Override
    public void sortStud(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);
            sortStud(arr, begin, partitionIndex-1);
            sortStud(arr, partitionIndex+1, end);
        }
    }
    public static void main(String[]args)
    {
        SortStudentByGPA righteousFury = new SortStudentByGPA();
        int[] input = {1,6,3,6};
        righteousFury.sortStud(input,0,3);
        System.out.println(Arrays.toString(input));
    }
}

