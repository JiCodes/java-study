import java.util.Collection;

public class PrimeCounter {
    public static int countPrimes(Collection<Integer> collection) {
        int count = 0;
        for (Integer i : collection) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

