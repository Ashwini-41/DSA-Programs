/*7. Take a range of 0 - 1000 Numbers and find the Prime numbers in that range. */
package Algorithm_DSA_Programs;

public class PrimeNumber {

    static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 0 || n == 1) {
            flag = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int start = 0;
        int end = 1000;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
