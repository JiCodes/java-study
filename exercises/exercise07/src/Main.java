import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        // Test Prime Counter
        // Create a collection of integers to test the countPrimes method
        Collection<Integer> numbers = new ArrayList<>();
        for (int i = 2; i < 25; i++) {
            numbers.add(i);
        }
        // Call the countPrimes method to count the number of prime numbers in the collection
        int numPrimes = PrimeCounter.countPrimes(numbers);
        // Print the number of prime numbers in the collection
        System.out.println("Number of primes in the collection: " + numPrimes);

        // Test Element Exchange
        Integer[] items = {1, 2, 3, 4, 5};
        System.out.println("Origin Array: " + Arrays.toString(items));

        ElementExchange.exchange(items, 1, 3);
        System.out.println("Array after exchange: " + Arrays.toString(items));


    }
}
