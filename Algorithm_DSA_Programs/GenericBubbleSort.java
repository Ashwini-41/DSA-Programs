package Algorithm_DSA_Programs;

import java.util.Arrays;

public class GenericBubbleSort<T extends Comparable<T>> {

    private void bubbleSort(T[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;

            for (int j = 0; j < n - 1; j++) {

                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

        }
    }

    public static void main(String[] args) {
        GenericBubbleSort<Integer> bubble = new GenericBubbleSort<>();
        Integer arr[] = { 30, 40, 10, 65, 25, 35, 67, 15 };

        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));

        bubble.bubbleSort(arr);

        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));

    }

}
