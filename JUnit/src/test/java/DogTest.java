import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    static Dog dog;
//    @BeforeEach
//    void prepareData() {
//        dog = new Dog("Albert", 14);
//    }

    @BeforeAll
    static void prepareData() {
        dog = new Dog("Albert", 14);
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethod() {
        dog.setName("Roman");
        assertEquals("Albert", dog.getName());
    }

    @Test
    void testSetDogNameMethodIfEmpty() {
        Dog dog = new Dog("", 14);
        dog.setName("Roman");
        assertEquals("Roman", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testGetDogNameMethod() {
        assertEquals("Albert", dog.getName());
    }
    
    void setAge() {
    }

    @org.junit.jupiter.api.Test
    void testGetAgeMethod() {
        assertEquals(14, dog.getAge());
    }}