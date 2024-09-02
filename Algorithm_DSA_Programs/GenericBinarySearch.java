package Algorithm_DSA_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class GenericBinarySearch<T extends Comparable<T>> {

    public int binarySearch(T[] word, T searchW) {
        int left = 0;
        int right = word.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = searchW.compareTo(word[mid]);

            if (result == 0) {
                return mid;
            }

            if (result > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        GenericBinarySearch<String> search = new GenericBinarySearch<>();
        Scanner sc = new Scanner(System.in);
        String str = "apple,banana,cherry,date,fig,grape";
        String[] words = str.split(",");

        Arrays.sort(words);
        System.out.println("Enter word for search: ");
        String searchW = sc.nextLine();

        // int ind = Arrays.binarySearch(words, searchW);

        int result = search.binarySearch(words, searchW);

        if (result > 0) {
            System.out.println("Word found at index " + result);
        } else {
            System.out.println("word not found");
        }

        sc.close();
    }
}
