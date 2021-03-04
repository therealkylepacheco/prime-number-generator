package com.company;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputTest {
    /**
     * isValid
     */
    @Test
    public void isValid_isNum() {
        Input input = new Input();
        String[] args = {"5", "10"};
        assertThat(input.isValid(args), is(true));
    }
    @Test
    public void isValid_isNotNum_Alpha() {
        Input input = new Input();
        String[] args = {"abc", "xyz"};
        assertThat(input.isValid(args), is(false));
    }
    @Test
    public void isValid_isNotNum_Symbol() {
        Input input = new Input();
        String[] args = {"~!@#$%", "&*()_+=-"};
        assertThat(input.isValid(args), is(false));
    }
    @Test
    public void isValid_tooManyArgs() {
        Input input = new Input();
        String[] args = {"5", "10", "15"};
        assertThat(input.isValid(args), is(false));
    }
    @Test
    public void isValid_tooFewArgs() {
        Input input = new Input();
        String[] args = {"5"};
        assertThat(input.isValid(args), is(false));
    }
    @Test
    public void isValid_noArgs() {
        Input input = new Input();
        String[] args = {};
        assertThat(input.isValid(args), is(true));
    }
}
