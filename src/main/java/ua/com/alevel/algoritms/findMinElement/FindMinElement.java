package ua.com.alevel.algoritms.findMinElement;

public class FindMinElement {

    static int[] array = {13, 45, 23, 43, 34, 57, 87, 41, 91, 87, 99 , 11};

    public static void main(String[] args) {
        FindMinElement findMinElement = new FindMinElement();
        System.out.println(findMinElement.findMinElement(array));
    }


    public int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
