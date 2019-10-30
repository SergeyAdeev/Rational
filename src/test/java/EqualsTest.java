import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualsTest {

    private void assertEqualsTrue(Rational firstRational, Object secondRational) {
        assertTrue("Equals returns wrong result " + firstRational + " equals " + secondRational,
                firstRational.equals(secondRational));
    }

    private void assertEqualsFalse(Rational firstRational, Object secondRational) {
        assertFalse("Equals returns wrong result " + firstRational + " not equals " + secondRational,
                firstRational.equals(secondRational));
    }

    @Test
    public void compareWithNull() {
        Rational firstRational = new Rational(3, 2);
        Object secondRational = null;
        assertEqualsFalse(firstRational, secondRational);
    }

    @Test
    public void compareWithString() {
        Rational firstRational = new Rational(3, 2);
        String secondRational = "one";
        assertEqualsFalse(firstRational, secondRational);
    }

    @Test
    public void equalsInteger() {
        Rational firstRational = new Rational(1, 1);
        Rational secondRational = new Rational(1, 1);
        assertEqualsTrue(firstRational, secondRational);
    }

    @Test
    public void equals() {
        Rational firstRational = new Rational(-1, 5);
        Rational secondRational = new Rational(-1, 5);
        assertEqualsTrue(firstRational, secondRational);
    }

    @Test
    public void notEquals() {
        Rational firstRational = new Rational(1, 3);
        Rational secondRational = new Rational(1, 5);
        assertEqualsFalse(firstRational, secondRational);
    }
}
