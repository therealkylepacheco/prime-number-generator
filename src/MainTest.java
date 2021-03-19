import org.junit.Test;

public class MainTest {
    
    @Test
    public void main_standardInput() {
        Main driver = new Main();
        String[] input = {"1", "20"};
        driver.main(input);
    }
}
