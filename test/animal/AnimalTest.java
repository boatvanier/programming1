package animal;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animal;

    @BeforeAll
    static void init(){
        System.out.println("Animal Class tests begin.");
    }
    @AfterAll
    static void tearDownAll() {
        System.out.println("All tests are done.");
    }

    @BeforeEach
    void setUp() {
        animal = new Animal(10,Species.CAT, "cuty", "C1");
    }
    @AfterEach
    void tearDown() {
        System.out.println("test completed.");
    }

    @Test
    void testInitialWeight(){
        assertEquals(10.0, animal.getWeight() );
    }
    @Test
    void testValidName() {
        assertEquals("cuty", animal.getName());
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, 10, 20})
    void testValidWeight(double weight) {
        animal.setWeight(weight);
        assertTrue(animal.getWeight() > 0);
    }

    @ParameterizedTest
    @CsvSource({
            "Tom, true",
            "'', false",
            " , false"
    })
    void testSetName(String inputName, boolean isValid){
        animal.setName(inputName);

        if (isValid) {
            assertEquals(inputName, animal.getName());
        } else {
            assertEquals("cuty", animal.getName());
        }
    }
}