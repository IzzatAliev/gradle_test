package ua.com.alevel.algoritms.combSort;

import java.util.Arrays;

public class CombSort {

    static int[] array = {13, 45, 23, 43, 34, 57, 87, 41, 91, 87, 99, 11};

    public static void main(String[] args) {
        CombSort combSort = new CombSort();
        long start = System.currentTimeMillis();
        combSort.combSort(array);
        System.out.println(System.currentTimeMillis() - start + "ms");
    }

    public void combSort(int[] array) {
        int gap = array.length;
        boolean isSorted = false;
        while (!isSorted || gap != 1) {

            if (gap > 1) {
                gap = gap * 10 / 13;
            } else {
                gap = 1;
            }
            isSorted = true;
            for (int i = gap; i < array.length; i++) {
                if (array[i] < array[i - gap]) {
                    int tmp = array[i];
                    array[i] = array[i - gap];
                    array[i - gap] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
