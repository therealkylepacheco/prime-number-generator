package com.company;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PNGTest {
    /**
     * isPrime
     */
    @Test
    public void isPrime_evenTest() {
        PNG png = new PNG();
        assertThat(png.isPrime(10), is(false));
    }

    @Test
    public void isPrime_twoTest() {
        PNG png = new PNG();
        assertThat(png.isPrime(2), is(true));
    }

    @Test
    public void isPrime_primeTest() {
        PNG png = new PNG();
        assertThat(png.isPrime(7), is(true));
    }

    @Test
    public void isPrime_largePrimeTest() {
        PNG png = new PNG();
        assertThat(png.isPrime(7919), is(true));
    }

    @Test
    public void isPrime_compositeTest() {
        PNG png = new PNG();
        assertThat(png.isPrime(15), is(false));
    }

    @Test
    public void isPrime_largeComposite() {
        PNG png = new PNG();
        assertThat(png.isPrime(7905), is(false));
    }

    /**
     * generate
     */
    @Test
    public void generate_basicSet() {
        PNG png = new PNG();
        List<Integer> expect = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        assertThat(png.generate(1, 100), is(expect));
    }

    @Test
    public void generate_emptySet() {
        PNG png = new PNG();
        List<Integer> expect = new ArrayList<Integer>();
        assertThat(png.generate(62, 66), is(expect));
    }

    @Test
    public void generate_practiceData() {
        PNG png = new PNG();
        List<Integer> expect = Arrays.asList(7901, 7907, 7919);
        assertThat(png.generate(7900, 7920), is(expect));
    }
}
