package test.java;

import main.java.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}