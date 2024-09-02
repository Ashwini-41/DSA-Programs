/*
 * Bubble Sort
a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
b. I/P -> read in the list ints
c. O/P -> Print the Sorted List
 */
package Algorithm_DSA_Programs;

import java.util.Arrays;

public class BubbleSort {

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n; i++) {
            swapped = false;

            for (int j = 0; j < n - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
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
        int arr[] = { 30, 40, 10, 65, 25, 35, 67, 15 };

        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));

    }
}
