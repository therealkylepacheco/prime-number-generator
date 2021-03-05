import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

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
    public void isValid_isNotNum_AlphaAndNum() {
        Input input = new Input();
        String[] args = {"abc", "15"};
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
        assertThat(input.isValid(args), is(false));
    }
    @Test
    public void isValid_isDouble() {
        Input input = new Input();
        String[] args = {"5.25", "10.9873"};
        assertThat(input.isValid(args), is(false));
    }
    @Test
    public void isValid_isNegative() {
        Input input = new Input();
        String[] args = {"-5", "10"};
        assertThat(input.isValid(args), is(false));
    }

    /**
     * prepareArgs
     */
    @Test
    public void prepareArgs_standardOrder() {
        Input input = new Input();
        String[] args = {"25", "100"};
        Integer[] bounds = {25, 100};
        assertThat(input.prepareArgs(args), is(bounds));
    }
    @Test
    public void prepareArgs_inverseOrder() {
        Input input = new Input();
        String[] args = {"100", "25"};
        Integer[] bounds = {25, 100};
        assertThat(input.prepareArgs(args), is(bounds));
    }
    @Test
    public void prepareArgs_noOrder() {
        Input input = new Input();
        String[] args = {"25", "25"};
        Integer[] bounds = {25, 25};
        assertThat(input.prepareArgs(args), is(bounds));
    }
}
