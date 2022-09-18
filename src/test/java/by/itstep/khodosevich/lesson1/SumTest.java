package by.itstep.khodosevich.lesson1;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumTest extends TestCase {
    private int firstValue;
    private int secondValue;
    private int result;
    Sum sum;


    public SumTest(int firstValue, int secondValue, int result) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection parametersForTest(){
        return Arrays.asList(new Object[][]{
                {1,1,2},
                {2,2,4},
                {3,3,6},
                {4,4,8}
        });
    }

    @Before
    public void before(){
        sum = new Sum();
    }

    @Test
    public void sum_PositiveTest_WithAccessData(){
        String msg = "Your method works bad!!!";
        Assert.assertEquals(msg, result, sum.sum(firstValue, secondValue));
    }




}