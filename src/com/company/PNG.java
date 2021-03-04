package com.company;

import java.util.List;

public class PNG implements PrimeNumberGenerator{
    //@Override
    public boolean isPrime(int value) {
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

    //@Override
    public List<Integer> generate(int startingValue, int endingValue) {
        return null;
    }
}
