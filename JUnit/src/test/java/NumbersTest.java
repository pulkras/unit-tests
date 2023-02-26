package test.java;

import main.java.classesForTests.Numbers;
import org.testng.annotations.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void sumTest() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}