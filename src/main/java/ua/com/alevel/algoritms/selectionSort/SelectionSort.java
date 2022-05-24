package ua.com.alevel.algoritms.selectionSort;

import java.util.Arrays;

public class SelectionSort {

    static int[] array = {13, 45, 23, 43, 34, 57, 87, 41, 91, 87, 99};

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        for (int i = 0; i < args.length; i++) {
            int min = selectionSort.min(array, i, array.length);
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        System.out.println(Arrays.toString(array));
    }

    private int min(int[] array, int start, int end) {
        int minIndex = start;
        int minValue = array[start];
        for (int i = start + 1; i < end; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
