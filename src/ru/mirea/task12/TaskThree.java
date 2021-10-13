package ru.mirea.task12;
import java.util.Arrays;

public class TaskThree {
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {return;}
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    public int[] combine(int[] a, int[] b){
       int first = a.length;
       int second= b.length;
       int [] res = new int[first+second];
       System.arraycopy(a, 0, res, 0, first);
       System.arraycopy(b, 0, res, first, second);
       mergeSort(res, first+second);
       return res;
    }
    public static void main(String[]args)
    {
       TaskThree Piosscholar = new TaskThree();
        int[] input = {1,6,3,6};
        int[] input_two = {8,5,7,0};
        int[] output = Piosscholar.combine(input, input_two);
        Piosscholar.mergeSort(input,4);
        System.out.println(Arrays.toString(output));
    }
}
