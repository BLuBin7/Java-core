package tesst;

import com.syntax.jmaster.Java50.SimpleCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void twoPlusShouldEqualFour()
    {
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }
}
