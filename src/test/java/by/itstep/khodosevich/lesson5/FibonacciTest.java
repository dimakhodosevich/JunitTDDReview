package by.itstep.khodosevich.lesson5;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    @FileParameters("src/test/source/fibonacci.csv") // divide all parameters by ','
    public void fibonacci_PositiveTest_WithAccessData(int number, int result) {
        assertEquals(result, fibonacci.getFibonacciNumber(number));
    }
}