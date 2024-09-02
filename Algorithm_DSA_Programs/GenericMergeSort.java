package Algorithm_DSA_Programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericMergeSort<T extends Comparable<T>> {

    public void merge(T[] arr, int start, int mid, int end) {
        int leftsize = mid - start + 1;
        int rightsize = end - mid;

        @SuppressWarnings("unchecked")
        T[] leftArr = (T[]) Array.newInstance(arr.getClass().getComponentType(), leftsize);

        @SuppressWarnings("unchecked")
        T[] rightarr = (T[]) Array.newInstance(arr.getClass().getComponentType(), rightsize);

        for (int i = 0; i < leftsize; i++) {
            leftArr[i] = arr[start + i];
        }
        for (int j = 0; j < rightsize; j++) {
            rightarr[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = start;

        while (i < leftsize && j < rightsize) {
            if (leftArr[i].compareTo(rightarr[j]) <= 0) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }

        while (i < leftsize) {
            arr[k] = leftArr[i];
            i++;
            k++;

        }
        while (j < rightsize) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }

        // T[] rightarr = new T[rightsize];
    }

    public void mergeSort(T[] arr, int start, int end) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid - 1);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        GenericMergeSort<String> mgsort = new GenericMergeSort<>();
        // int arr[] = {12,20,34,55,45,76,43,78,98,68,30};
        String[] arr = { "flower", "rose", "lily", "sunflower", "lotus", "mogra", "apple" };

        System.out.println("Array Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        mgsort.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Array After Merge Sort: ");
        System.out.println(Arrays.toString(arr));
    }
}
