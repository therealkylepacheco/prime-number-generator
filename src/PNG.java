import java.util.ArrayList;
import java.util.List;

public class PNG implements PrimeNumberGenerator{

    /**
     * Check if integer is prime
     * @param value int Value
     * @return boolean
     */
    public boolean isPrime(int value) {
        if(value == 0 || value == 1) {
            return false;
        }
        if (value % 2 == 0 && value != 2) {
            return false;
        }
        for (int i = 3; i < value; i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Generate list of prime numbers within a certain range
     * @param startingValue int Lower bound
     * @param endingValue int Upper bound
     * @return List<Integer>
     */
    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primes = new ArrayList<>();
        for (int value = startingValue; value <= endingValue; value++) {
            if (isPrime(value)) {
                primes.add(value);
            }
        }
        return primes;
    }
}
