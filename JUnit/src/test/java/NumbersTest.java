import static org.junit.Assert.*;

public class NumbersTest {

    @org.junit.Test
    public void sumTest() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}