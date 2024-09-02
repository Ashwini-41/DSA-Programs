/*
 * An Anagram Detection Example
a. Desc -> One string is an anagram of another if the second is simply a
rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
c. O/P -> The Two Strings are Anagram or not....
 */
package Algorithm_DSA_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

    public static boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String : ");
        String str1 = sc.nextLine();

        System.out.print("Enter second String : ");
        String str2 = sc.nextLine();

        // Anagram obj = new Anagram();

        if (checkAnagram(str1, str2)) {
            System.out.println("Two strings are anagram");
        } else {
            System.out.println("Two strings are not anagram");

        }
        sc.close();

    }
}
