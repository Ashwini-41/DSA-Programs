/*
 Insertion Sort
a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
b. I/P -> read in the list words
c. Logic -> Use Insertion Sort to sort the words in the String array
d. O/P -> Print the Sorted List
 */
package Algorithm_DSA_Programs;

import java.util.Arrays;

public class InsertionSort {

    private static void inserstionSorting(String[] arr) {

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        String[] arr = { "rose", "lotus", "apple", "grapes", "orange" };
        System.out.println("Array before sorting : ");
        System.out.println(Arrays.toString(arr));

        inserstionSorting(arr);
        System.out.println("Array after sorting : ");
        System.out.println(Arrays.toString(arr));

    }
}
