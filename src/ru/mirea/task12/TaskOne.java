package ru.mirea.task12;

import java.util.Arrays;

public class TaskOne {
    public static void ins(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key;
        }
    }
    public static void main(String[]args)
    {
        TaskOne ivoryArrow = new TaskOne();
        int[] input = {1,6,3,6};
        ivoryArrow.ins(input);
        System.out.println(Arrays.toString(input));
    }
}
