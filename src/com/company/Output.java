package com.company;

import java.util.List;

public class Output {

    public String print(List<Integer> resultSet) {
        String printable = "";
        if (resultSet.size() == 0) {
            return "No primes in range";
        }
        for (int i = 0; i < resultSet.size(); i++) {
            printable += resultSet.get(i) + "\n";
        }
        return printable;
    }
}
