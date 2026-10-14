package nivel1.genericMethodsWithDifferentParameters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Adriana", "Elliott", 23);
    }

    @Test
    void getNameReturnsName() {
        assertEquals("Adriana", person.getName());
    }

    @Test
    void getSurnameReturnsSurname() {
        assertEquals("Elliott", person.getSurname());
    }

    @Test
    void getAgeReturnsAge() {
        assertEquals(23, person.getAge());
    }



}