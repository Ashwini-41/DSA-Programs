package Algorithm_DSA_Programs;

import java.util.Arrays;

public class GenericInsertionSort<T extends Comparable<T>> {
    private void inserstionSorting(T[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            T key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        GenericInsertionSort<String> sortI = new GenericInsertionSort<>();
        String[] arr = { "rose", "lotus", "apple", "grapes", "orange" };
        System.out.println("Array before sorting : ");
        System.out.println(Arrays.toString(arr));

        sortI.inserstionSorting(arr);
        System.out.println("Array after sorting : ");
        System.out.println(Arrays.toString(arr));

        Integer[] arr1 = { 12, 34, 55, 10, 89, 67, 54, 23, 32 };
        GenericInsertionSort<Integer> sortI1 = new GenericInsertionSort<>();
        System.out.println("Array before sorting : ");
        System.out.println(Arrays.toString(arr1));

        sortI1.inserstionSorting(arr1);
        System.out.println("Array after sorting : ");
        System.out.println(Arrays.toString(arr1));

    }
}
