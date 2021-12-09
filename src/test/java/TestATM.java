import org.junit.Test;

public class TestATM {
    @Test
    public void testValid() {
        new ATM().process(135);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalid() {
        new ATM().process(238);
    }
}