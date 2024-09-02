package Algorithm_DSA_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationsOfString {

    private static List<String> getPermutationRecursive(String str) {
        List<String> permutation = new ArrayList<>();
        if (str == null || str.length() == 0) {
            permutation.add("");
            return permutation;
        }
        char firstChar = str.charAt(0);
        String remainingStr = str.substring(1);
        List<String> words = getPermutationRecursive(remainingStr);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                permutation.add(word.substring(0, i) + firstChar + word.substring(i));

            }
        }
        return permutation;

    }

    private static List<String> getPermutationIterative(String str) {
        List<String> permutation = new ArrayList<>();
        permutation.add(String.valueOf(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            List<String> newPer = new ArrayList<>();
            char currentChar = str.charAt(i);
            for (String perm : permutation) {
                for (int j = 0; j <= perm.length(); j++) {
                    newPer.add(perm.substring(0, j) + currentChar + perm.substring(j));
                }
            }
            permutation = newPer;
        }

        return permutation;
    }

    public static void main(String[] args) {
        String input = "ABC";
        List<String> permutationsIterative = getPermutationIterative(input);
        List<String> permutationsRecursive = getPermutationRecursive(input);

        System.out.println("Permutations using iterative: " + permutationsIterative);
        System.out.println("Permutations using recursive: " + permutationsRecursive);

        Collections.sort(permutationsIterative);
        Collections.sort(permutationsRecursive);

        boolean isEqual = permutationsRecursive.equals(permutationsIterative);

        System.out.println("Equal or not  ? " + isEqual);

    }

}
