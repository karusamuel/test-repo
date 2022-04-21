import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenNumberCalculatorTest {
    @Test
    public void isEven_returnTrueWhenNumberIsEven_True(){
        EvenNumberCalculator evenNumberCalculator = new EvenNumberCalculator();
        boolean expected = true;
        assertEquals(expected,evenNumberCalculator.isEven(4));
    }

    @Test
    public void isEven_returnTrueWhenNumberIsEven_False(){
        EvenNumberCalculator evenNumberCalculator = new EvenNumberCalculator();
        boolean expected = false;
        assertEquals(expected,evenNumberCalculator.isEven(5));
    }

}
