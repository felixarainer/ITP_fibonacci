/**
 * Created by felix on 03.03.2017.
 */

package at.htlwels.rainerfel;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonacciTest {
        @Test
        public void evaluatesExpression() {
            assertEquals(8, Fibonacci.calculate(6));
        }
}
