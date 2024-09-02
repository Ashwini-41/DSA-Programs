/*- Write a program to do Merge Sort of list of Strings. */
package Algorithm_DSA_Programs;

import java.util.Arrays;

public class MergeSort {
    private static void merge(String[] arr, int leftStart, int mid, int rightEnd) {
        int leftsize = mid - leftStart + 1;
        int rightsize = rightEnd - mid;

        String[] leftarr = new String[leftsize];
        String[] rightarr = new String[rightsize];

        for (int i = 0; i < leftsize; i++) {
            leftarr[i] = arr[leftStart + i];
        }

        for (int j = 0; j < rightsize; j++) {
            rightarr[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = leftStart;

        while (i < leftsize && j < rightsize) {

            if (leftarr[i].compareTo(rightarr[j]) <= 0) {
                arr[k] = leftarr[i];
                i++;
            } else {
                arr[k] = rightarr[j];
                j++;
            }

            k++;
        }

        while (i < leftsize) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while (j < rightsize) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(String[] arr, int leftStart, int rightEnd) {
        if (leftStart < rightEnd) {
            int mid = leftStart + (rightEnd - leftStart) / 2;
            mergeSort(arr, leftStart, mid - 1);
            mergeSort(arr, mid + 1, rightEnd);

            merge(arr, leftStart, mid, rightEnd);
        }
    }

    public static void main(String[] args) {
        // int arr[] = {12,20,34,55,45,76,43,78,98,68,30};
        String[] arr = { "flower", "rose", "lily", "sunflower", "lotus", "mogra", "apple" };

        System.out.println("Array Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Array After Merge Sort: ");
        System.out.println(Arrays.toString(arr));
    }
}
