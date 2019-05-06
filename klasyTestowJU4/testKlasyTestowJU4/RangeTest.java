package czarnotalukasz.klasyTestowJU4.testKlasyTestowJU4;

import czarnotalukasz.klasyTestowJU4.Range;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RangeTest {
    private Range range;

    @Before
    public void setUp() {
        range = new Range(10, 20);
    }
    @Test
    public void shouldSayThat15IsInRange() {
        //Range range = new Range(10,20);
        Assert.assertTrue(range.isInRange(15));
        Assert.assertFalse(range.isInRange(5));
        Assert.assertNotNull(range.isInRange(11));
    }
    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionOnWrongParameters() {
        new Range(20,10);
    }
    @Test
    public void shouldHaveProperErrorMessage() {
        try {
            new Range(20, 10);
            fail("Exception wasn't thrown!");
        }
        catch (IllegalArgumentException exception) {
            assertEquals("lowerBound is bigger than upperBound!", exception.getMessage());
        }
    }
}