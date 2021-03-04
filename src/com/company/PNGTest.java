package com.company;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class PNGTest {

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
}
