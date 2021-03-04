package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OutputTest {
    /**
     * print
     */
    @Test
    public void print_resultSet() {
        Output output = new Output();
        List<Integer> list = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23);
        String printable = "2\n3\n5\n7\n11\n13\n17\n19\n23\n";
        assertThat(output.print(list), is(printable));
    }
    @Test
    public void print_emptySet() {
        Output output = new Output();
        List<Integer> list = new ArrayList<>();
        String printable = "No primes in range";
        assertThat(output.print(list), is(printable));
    }
}
