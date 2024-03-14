import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorialZero() {
        assertEquals(1, Main.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Main.factorial(1));
    }

    @Test
    public void testFactorialFive() {
        assertEquals(120, Main.factorial(5));
    }
}
