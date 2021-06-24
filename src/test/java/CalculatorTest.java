import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private static final double DELTA = 1e-10;
    private static Calculator calc;

    @BeforeClass
    public static void initialize(){
        calc = new Calculator();

    }

    @Test
    public  void  factorialPositive()
    {
        assertEquals("[Positive Case]: Factorial of a number, ",120,calc.Factorial(5),DELTA);
        assertEquals("[Positive Case]: Factorial of a number, ",5040,calc.Factorial(7),DELTA);
        assertEquals("[Positive Case]: Factorial of a number, ",Double.NaN,calc.Factorial(-2),DELTA);
    }
    @Test
    public void factorialNegative()
    {
        assertNotEquals("[Negative Case]: Factorial of a number,",24,calc.Factorial(5),DELTA);
        assertNotEquals("[Negative Case]: Factorial of a number,",120,calc.Factorial(7),DELTA);
        assertNotEquals("[Negative Case]: Factorial of a number,",5,calc.Factorial(-3),DELTA);
    }
    @Test
    public  void  exponentiationPositive()
    {
        assertEquals("[Positive Case]: Power of a number, ",32,calc.Power(2,5),DELTA);
        assertEquals("[Positive Case]: Power of a number, ",0.1111111111,calc.Power(3,-2),DELTA);
        assertEquals("[Positive Case]: Power of a number, ",Double.NaN,calc.Power(0,0),DELTA);
    }
    @Test
    public  void  exponentiationNegative()
    {
        assertNotEquals("[Negative Case]: Power of a Number, ",31,calc.Power(2,5),DELTA) ;
        assertNotEquals("[Negative Case]: Power of a Number, ",0.1111111122,calc.Power(3,-2),DELTA);
        assertNotEquals("[Negative Case]: Power of a Number, ",1,calc.Power(0,0),DELTA);
    }
    @Test
    public  void  logPositive()
    {
        assertEquals("[Positive Case]: Log of a number, ",2.302585092994,calc.Log(10),DELTA);
        assertEquals("[Positive Case]: Log of a number, ",Double.NEGATIVE_INFINITY,calc.Log(0),DELTA);
        assertEquals("[Positive Case]: Log of a number, ",Double.NaN,calc.Log(-5),DELTA);
    }
    @Test
    public  void  logNegative()
    {
        assertNotEquals("[Negative Case]: Log of a number, ", 6, calc.Log(3), DELTA);
        assertNotEquals("[Negative Case]: Log of a number, ", -7.3, calc.Log(1.6), DELTA);
        assertNotEquals("[Negative Case]: Log of a number, ", 0, calc.Log(0), DELTA);
        assertNotEquals("[Negative Case]: Log of a number, ", 9.0, calc.Log(-5), DELTA);
    }
    @Test
    public void sqrtPositive(){
        assertEquals("[Positive Case]: SQRT of a number, ", 2, calc.Sqrt(4), DELTA);
        assertEquals("[Positive Case]: SQRT of a number, ", 2.236067977499, calc.Sqrt(5), DELTA);
        assertEquals("[Positive Case]: SQRT of a number, ", 0, calc.Sqrt(0), DELTA);
        assertEquals("[Positive Case]: SQRT of a number, ", Double.NaN, calc.Sqrt(-2), DELTA);
    }
    @Test
    public void sqrtNegative(){
        assertNotEquals("[Negative Case]: SQRT of a number, ", 6, calc.Sqrt(4), DELTA);
        assertNotEquals("[Negative Case]: SQRT of a number, ", 4.2, calc.Sqrt(2.1), DELTA);
        assertNotEquals("[Negative Case]: SQRT of a number, ", 7.3, calc.Sqrt(-5), DELTA);
    }

}