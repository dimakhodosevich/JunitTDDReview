package by.itstep.khodosevich.lesson4;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(JUnitParamsRunner.class)
public class MinusTest {
    Minus minus = new Minus();


    @Test
//    @Parameters(source = ParametersForMinusTest.class)
    @Parameters
    public void minus_PositiveTest_WithAccessData(int firstValue, int secondValue, int result){
        assertEquals(result, minus.minus(firstValue,secondValue));
    }

    // parametersFor - only for method
    public static Object[] parametersForMinus_PositiveTest_WithAccessData(){
        return new Object[]{
                new Object[]{1,1,0},
                new Object[]{2,2,0},
                new Object[]{3,5,-2}
        };
    }

}