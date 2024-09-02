/*
 Binary Search the Word from Word List
a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not
 */
package Algorithm_DSA_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(String[] word, String searchW) {
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
        Scanner sc = new Scanner(System.in);
        String str = "apple,banana,cherry,date,fig,grape";
        String[] words = str.split(",");

        Arrays.sort(words);
        System.out.println("Enter word for search: ");
        String searchW = sc.nextLine();

        // int ind = Arrays.binarySearch(words, searchW);

        int result = binarySearch(words, searchW);

        if (result > 0) {
            System.out.println("Word found at index " + result);
        } else {
            System.out.println("word not found");
        }

        sc.close();
    }
}
