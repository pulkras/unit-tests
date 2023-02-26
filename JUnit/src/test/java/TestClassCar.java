package test.java;

import main.java.classesForTests.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestClassCar {

    Car car;

    @BeforeEach
    public void createACar() {
        car = new Car("bmw", "232", 2020, "Pavel");
    }

    @Test
//    @Execution(ExecutionMode.SAME_THREAD)
    @Execution(ExecutionMode.CONCURRENT)
    public void getNumber() {
        assertEquals("232", car.getNumber());
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    @EnabledOnJre(JRE.JAVA_17)
    @DisabledOnOs(OS.WINDOWS)
    @DisabledOnJre(JRE.JAVA_15)
    @Execution(ExecutionMode.CONCURRENT)
    public void getCarYear() {
        assertEquals(2020, car.getYear());
    }

    @Test
    @Execution(ExecutionMode.CONCURRENT)
    public void getCarOwnerName() {
        assertEquals("Pavel", car.getOwnerName());
    }

    @Test
    public void testClassWithExecution() {
        assertThrows(Exception.class, () -> {
            car.getDataFromRemoteServer();
        });
    }

}
