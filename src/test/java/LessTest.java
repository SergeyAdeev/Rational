import org.junit.Test;

import static org.junit.Assert.*;

public class LessTest {

    private void assertLessTrue(Rational firstRational, Rational secondRational) {
        assertTrue("Less returns wrong result " + firstRational + " less than " + secondRational,
                firstRational.less(secondRational));
    }

    private void assertLessFalse(Rational firstRational, Rational secondRational) {
        assertFalse("Less returns wrong result " + firstRational + " not less than " + secondRational,
                firstRational.less(secondRational));
    }

    @Test
    public void lessDenominatorEquals() {
        Rational firstRational = new Rational(1, 2);
        Rational secondRational = new Rational(3, 2);
        assertLessTrue(firstRational, secondRational);
    }

    @Test
    public void moreDenominatorEquals() {
        Rational firstRational = new Rational(1, 3);
        Rational secondRational = new Rational(-2, 3);
        assertLessFalse(firstRational, secondRational);
    }

    @Test
    public void lessNumeratorEquals() {
        Rational firstRational = new Rational(2, 5);
        Rational secondRational = new Rational(2, 3);
        assertLessTrue(firstRational, secondRational);
    }

    @Test
    public void nullEquals() {
        Rational firstRational = new Rational();
        Rational secondRational = new Rational();
        assertLessFalse(firstRational, secondRational);
    }

    @Test
    public void less() {
        Rational firstRational = new Rational(1, 6);
        Rational secondRational = new Rational(2, 5);
        assertLessTrue(firstRational, secondRational);
    }

    @Test
    public void moreInverted() {
        Rational firstRational = new Rational(2, 1);
        Rational secondRational = new Rational(1, 2);
        assertLessFalse(firstRational, secondRational);
    }

    @Test
    public void nullLessPositive() {
        Rational firstRational = new Rational();
        Rational secondRational = new Rational(2, 9);
        assertLessTrue(firstRational, secondRational);
    }

    @Test
    public void NegativeLessNull() {
        Rational firstRational = new Rational(-2, 7);
        Rational secondRational = new Rational();
        assertLessTrue(firstRational, secondRational);
    }
}
