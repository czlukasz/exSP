package czarnotalukasz.klasyTestowJU4.testKlasyTestowJU5;

import czarnotalukasz.klasyTestowJU4.Range;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeTest {
    private Range range;

    @BeforeEach
    void setUp() {
        range = new Range(10, 20);
    }
    @Test
    void shouldSayThat15IsInRange() {
        //Range range = new Range(10,20);
        assertTrue(range.isInRange(15));
        assertFalse(range.isInRange(5));
        assertNotNull(range.isInRange(11));
    }
    @Test
    void shouldThrowIllegalArgumentExceptionOnWrongParameters() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Range(20,10)
        );
        assertEquals("lowerBound is bigger than upperBound!", exception.getMessage());
    }
    @Test
    void shouldHaveProperErrorMessage() {

        try {
            new Range(20, 10);
            fail("Exception wasn't thrown!");
        }
        catch (IllegalArgumentException exception) {
            assertEquals("lowerBound is bigger than upperBound!", exception.getMessage());
        }
    }
}