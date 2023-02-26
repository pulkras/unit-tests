package test.java;

import main.java.classesForTests.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("BMW", "ABC", 2018, "Mikhail");
    }
    @Test
    void getManufacturer() {
        assertEquals("BMW", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("ABCD");
        assertEquals("ABCD", car.getNumber());
    }

    @ParameterizedTest
//    @ValueSource(strings = {"abc", "abc-213", "wep"})
//    @NullSource
//    @EmptySource
    @CsvSource(("'abc', 'abc'"))
    void testSetNumberMultipleValues(String number, String secondNumber) {
        car.setNumber(number);
        assertEquals(secondNumber, car.getNumber());
    }

    @ParameterizedTest
    @CsvSource(("1, 5"))
    void testInt(int input, int output) {
        assertEquals(car.testInt(input), output);
    }


    @Test
    void getYear() {
        assertEquals(2018, car.getYear());
    }

    @Test
    void getOwnerName() {
        assertEquals("Mikhail", car.getOwnerName());
    }

    @Test
    void setOwnerName() {
        car.setOwnerName("Danila");
        assertEquals("Danila", car.getOwnerName());
    }

    @Test
    void getListOfOwners() {
        assertArrayEquals(new String[]{"Mikhail"}, car.getOwners().toArray());
    }

    @Test
    void getListOfSeveralOwners() {
        car.setOwnerName("Danila");
        assertArrayEquals(new String[]{"Mikhail", "Danila"}, car.getOwners().toArray());
    }

    @Test
    public void testPrivateMethod() {
        try {
            Method method = Car.class.getDeclaredMethod("testMethod", null);

            method.setAccessible(true);

            assertEquals(method.invoke(car).toString(), "abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test public void testPrivateMethodWithArgument() {
        try {
            Method method = Car.class.getDeclaredMethod("testMethod", String.class);

            method.setAccessible(true);

            assertEquals(method.invoke(car, "abc").toString(), "abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ParameterizedTest
    @DisplayName("Test demonstrates how test data could be loaded from file")
    @CsvFileSource(resources = "/main/java/classesForTests/test-data.csv", delimiter = '|', numLinesToSkip = 1)
    public void testNumbers(String input, String expected) {
        car.setNumber(input);
        assertEquals(expected, car.getNumber());
    }
}