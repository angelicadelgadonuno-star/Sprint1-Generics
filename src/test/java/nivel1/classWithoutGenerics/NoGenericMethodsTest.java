package nivel1.classWithoutGenerics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NoGenericMethodsTest {

    private NoGenericMethods fruits;

    @BeforeEach
    void setUp() {
        fruits = new NoGenericMethods("apple", "pear", "orange");
    }

    @Test
    void getElement1ReturnsFirstArgument() {
        assertEquals("apple", fruits.getElement1());
    }

    @Test
    void getElement2ReturnsSecondArgument() {
        assertEquals("pear", fruits.getElement2());
    }

    @Test
    void getElement3ReturnsThirdArgument() {
        assertEquals("orange", fruits.getElement3());
    }

}