package tesst;

import com.syntax.jmasterCoBan.Java50.SimpleCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Simple calculator test.
 */
class SimpleCalculatorTest {

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
    }

    /**
     * Tear down.
     */
    @AfterEach
    void tearDown() {
    }

    /**
     * Two plus should equal four.
     */
    @Test
    void twoPlusShouldEqualFour()
    {
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }
}
