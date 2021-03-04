package com.company;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class PNGTest {

    @Test
    public void evenTest() {
        PNG png = new PNG();
        assertThat(png.isPrime(10), is(false));
    }

    @Test
    public void twoTest() {
        PNG png = new PNG();
        assertThat(png.isPrime(2), is(true));
    }
}
