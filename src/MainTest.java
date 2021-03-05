import org.junit.Test;

public class MainTest {

    @Test
    public void main_alphaInput() {
        Main driver = new Main();
        String[] input = {"1", "abc"};
        driver.main(input);
    }
    @Test
    public void main_standardInput() {
        Main driver = new Main();
        String[] input = {"1", "20"};
        driver.main(input);
    }
}
