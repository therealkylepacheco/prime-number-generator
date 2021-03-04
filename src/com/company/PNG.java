package com.company;

import java.util.ArrayList;
import java.util.List;

public class PNG implements PrimeNumberGenerator{

    public boolean isPrime(int value) {
        if(value == 0 || value == 1) {
            return false;
        }
        if (value % 2 == 0 && value != 2) {
            return false;
        }
        for (int i = 3; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> generate(int startingValue, int endingValue) {
        List<Integer> primes = new ArrayList<Integer>();
        for (int value = startingValue; value <= endingValue; value++) {
            if (isPrime(value)) {
                primes.add(value);
            }
        }
        return primes;
    }
}
