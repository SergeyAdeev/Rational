import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LessOrEqualsTest {
    @Test
    public void less() {
        Rational firstRational = new Rational(1, 2);
        Rational secondRational = new Rational(7, 2);
        assertTrue("LessOrEquals returns wrong result " + firstRational + " less than " + secondRational,
                firstRational.lessOrEqual(secondRational));
    }

    @Test
    public void more() {
        Rational firstRational = new Rational(5, 3);
        Rational secondRational = new Rational(-2, 7);
        assertFalse("LessOrEquals returns wrong result " + firstRational + " more than " + secondRational,
                firstRational.lessOrEqual(secondRational));
    }

    @Test
    public void equals() {
        Rational firstRational = new Rational(6, 1);
        Rational secondRational = new Rational(6, 1);
        assertTrue("LessOrEquals returns wrong result " + firstRational + " equals " + secondRational,
                firstRational.lessOrEqual(secondRational));
    }
}
