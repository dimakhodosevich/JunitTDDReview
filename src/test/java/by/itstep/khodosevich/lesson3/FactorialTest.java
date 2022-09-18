package by.itstep.khodosevich.lesson3;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class FactorialTest {

    private Factorial factorial= new Factorial();

    @Test
    @Parameters(method = "parametersForTest")
    public void factorial_PositiveResult_AccessData(int value, int result){
        Assert.assertEquals(result, factorial.getFactorial(value));
    }

    public Object[] parametersForTest(){
        return new Object[]{
                new Object[]{1,1},
                new Object[]{2,2},
                new Object[]{3,6},
                new Object[]{4,24},
                new Object[]{5,120}
        };
    }

}