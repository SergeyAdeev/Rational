import com.sun.org.apache.bcel.internal.generic.ATHROW;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ConstructorTest {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }

    @Test
    public void constructorReducePositive(){
        Rational result = new Rational(4,10);
        assertEquals("Constructor returns wrong numerator", 2, result.getNumerator());
        assertEquals("Constructor returns wrong denominator", 5, result.getDenominator());
    }

    @Test
    public void constructorSimplifyNegative(){
        Rational result = new Rational(-5,-2);
        assertEquals("Constructor returns wrong numerator", 5, result.getNumerator());
        assertEquals("Constructor returns wrong denominator", 2, result.getDenominator());
    }

    @Test
    public void constructorPositiveAndNegative(){
        Rational result = new Rational(2,-2);
        assertEquals("Constructor returns wrong numerator", -1, result.getNumerator());
        assertEquals("Constructor returns wrong denominator", 1, result.getDenominator());
    }

    // choose one of next
    @Test
    public void constructor_1_0() throws ArithmeticException{
        try{
            new Rational(1,0);
        } catch (ArithmeticException thrown){
            Assert.assertEquals("division by zero !", thrown.getMessage());
        }//fail
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void constructor_0_0() throws ArithmeticException{
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("division by zero !");
        new Rational(0,0);
        thrown = ExpectedException.none();
    }
    // end of choice
}