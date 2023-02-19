import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void testGetNameMethod() {
        Dog dog = new Dog("Albert", 14);
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }

    @org.junit.jupiter.api.Test
    void testGetAgeMethod() {
        Dog dog = new Dog("Albert", 14);
        assertEquals(14, dog.getAge());
    }}