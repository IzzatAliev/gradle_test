package ua.com.alevel.algoritms.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    static int[] array = {13, 45, 23, 43, 34, 57, 87, 41, 91, 87, 99};

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        long start = System.currentTimeMillis();
        bubbleSort.bubbleSort(array);
        System.out.println(System.currentTimeMillis() - start);
    }

    public void bubbleSort(int[] array){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]){
                        int tmp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
